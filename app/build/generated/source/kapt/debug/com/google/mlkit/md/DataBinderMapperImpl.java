package com.google.mlkit.md;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.mlkit.md.databinding.ActivityLiveBarcodeBindingImpl;
import com.google.mlkit.md.databinding.ActivityLiveObjectBindingImpl;
import com.google.mlkit.md.databinding.ActivityMainBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLIVEBARCODE = 1;

  private static final int LAYOUT_ACTIVITYLIVEOBJECT = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.md.R.layout.activity_live_barcode, LAYOUT_ACTIVITYLIVEBARCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.md.R.layout.activity_live_object, LAYOUT_ACTIVITYLIVEOBJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.google.mlkit.md.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLIVEBARCODE: {
          if ("layout/activity_live_barcode_0".equals(tag)) {
            return new ActivityLiveBarcodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_barcode is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLIVEOBJECT: {
          if ("layout/activity_live_object_0".equals(tag)) {
            return new ActivityLiveObjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_live_object is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_live_barcode_0", com.google.mlkit.md.R.layout.activity_live_barcode);
      sKeys.put("layout/activity_live_object_0", com.google.mlkit.md.R.layout.activity_live_object);
      sKeys.put("layout/activity_main_0", com.google.mlkit.md.R.layout.activity_main);
    }
  }
}
