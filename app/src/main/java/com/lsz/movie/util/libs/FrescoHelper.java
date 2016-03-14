package com.lsz.movie.util.libs;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

/**
 * Create by 吕洪涛
 * 2016/03/10 9:48
 */
public class FrescoHelper {
    private static final String IMAGE_CACHE = "img_cache";
    private static final int  MAX_CACHE_SIZE = 100 * 1024 * 1024;
    private static final int LOW_DISK_SPACE = 50 * 1024 * 1024;
    private static final int VERY_LOW_DISK_SPACE = 10 * 1024 * 1024;
    private static final int DEFAULT_MAX_MEMORY_SIZE = (int) (Runtime.getRuntime().maxMemory() / 8);

    private static FrescoHelper helper;

    private FrescoHelper() {

    }

    public static FrescoHelper getInstance() {
        if (helper == null) {
            helper = new FrescoHelper();
        }
        return helper;
    }

    public void init(Context context) {
        Fresco.initialize(context, getImageConfig(context));
    }

    public ImagePipelineConfig getImageConfig(Context context) {
        ImagePipelineConfig.Builder builder = ImagePipelineConfig.newBuilder(context);

        final MemoryCacheParams params = new MemoryCacheParams(
                DEFAULT_MAX_MEMORY_SIZE,
                Integer.MAX_VALUE,
                DEFAULT_MAX_MEMORY_SIZE,
                Integer.MAX_VALUE,
                Integer.MAX_VALUE);
        Supplier<MemoryCacheParams> supplier = new Supplier<MemoryCacheParams>() {
            @Override
            public MemoryCacheParams get() {
                return params;
            }
        };
        builder.setEncodedMemoryCacheParamsSupplier(supplier);

        DiskCacheConfig diskCacheConfig = DiskCacheConfig.newBuilder(context)
                .setBaseDirectoryPath(context.getExternalCacheDir())
                .setBaseDirectoryName(IMAGE_CACHE)
                .setMaxCacheSize(MAX_CACHE_SIZE)
                .setMaxCacheSizeOnLowDiskSpace(LOW_DISK_SPACE)
                .setMaxCacheSizeOnVeryLowDiskSpace(VERY_LOW_DISK_SPACE)
                .build();
        builder.setMainDiskCacheConfig(diskCacheConfig);

        return builder.build();

    }

    public void setPlaceImage(SimpleDraweeView view, Context context, int resId) {
        GenericDraweeHierarchyBuilder builder = GenericDraweeHierarchyBuilder.newInstance(context
                .getResources());
        builder.setPlaceholderImage(ContextCompat.getDrawable(context, resId));
        view.setHierarchy(builder.build());
    }

}

