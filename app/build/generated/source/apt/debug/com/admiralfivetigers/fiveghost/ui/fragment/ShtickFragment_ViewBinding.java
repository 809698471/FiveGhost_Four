// Generated code from Butter Knife. Do not modify!
package com.admiralfivetigers.fiveghost.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.admiralfivetigers.fiveghost.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShtickFragment_ViewBinding implements Unbinder {
  private ShtickFragment target;

  @UiThread
  public ShtickFragment_ViewBinding(ShtickFragment target, View source) {
    this.target = target;

    target.rvShtick = Utils.findRequiredViewAsType(source, R.id.rv_shtick, "field 'rvShtick'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShtickFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvShtick = null;
  }
}
