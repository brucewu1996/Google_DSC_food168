package com.google.mlkit.md.databinding;
import com.google.mlkit.md.R;
import com.google.mlkit.md.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLiveObjectBindingImpl extends ActivityLiveObjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.bottom_sheet, 4);
        sViewsWithIds.put(R.id.bottom_sheet_scrim_view, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @Nullable
    private final com.google.mlkit.md.databinding.TopActionBarInLiveCameraBinding mboundView01;
    @Nullable
    private final com.google.mlkit.md.databinding.CameraPreviewOverlayBinding mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLiveObjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityLiveObjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (bindings[4] != null) ? com.google.mlkit.md.databinding.ProductBottomSheetBinding.bind((android.view.View) bindings[4]) : null
            , (com.google.mlkit.md.productsearch.BottomSheetScrimView) bindings[5]
            , (com.google.mlkit.md.camera.CameraSourcePreview) bindings[1]
            );
        this.cameraPreview.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (bindings[3] != null) ? com.google.mlkit.md.databinding.TopActionBarInLiveCameraBinding.bind((android.view.View) bindings[3]) : null;
        this.mboundView1 = (bindings[2] != null) ? com.google.mlkit.md.databinding.CameraPreviewOverlayBinding.bind((android.view.View) bindings[2]) : null;
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.google.mlkit.md.camera.WorkflowModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.google.mlkit.md.camera.WorkflowModel Viewmodel) {
        this.mViewmodel = Viewmodel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}