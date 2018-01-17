// Generated code from Butter Knife. Do not modify!
package com.admiralfivetigers.fiveghost;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.admiralfivetigers.fiveghost.utils.MyViewPager;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.vpMain = Utils.findRequiredViewAsType(source, R.id.vp_main, "field 'vpMain'", MyViewPager.class);
    target.home = Utils.findRequiredViewAsType(source, R.id.home, "field 'home'", ImageView.class);
    target.rlOne = Utils.findRequiredViewAsType(source, R.id.rl_one, "field 'rlOne'", RelativeLayout.class);
    target.shtick = Utils.findRequiredViewAsType(source, R.id.shtick, "field 'shtick'", ImageView.class);
    target.rlTwo = Utils.findRequiredViewAsType(source, R.id.rl_two, "field 'rlTwo'", RelativeLayout.class);
    target.jiahao = Utils.findRequiredViewAsType(source, R.id.jiahao, "field 'jiahao'", ImageView.class);
    target.rlThree = Utils.findRequiredViewAsType(source, R.id.rl_three, "field 'rlThree'", RelativeLayout.class);
    target.order = Utils.findRequiredViewAsType(source, R.id.order, "field 'order'", ImageView.class);
    target.rlFor = Utils.findRequiredViewAsType(source, R.id.rl_for, "field 'rlFor'", RelativeLayout.class);
    target.personal = Utils.findRequiredViewAsType(source, R.id.personal, "field 'personal'", ImageView.class);
    target.rlFive = Utils.findRequiredViewAsType(source, R.id.rl_five, "field 'rlFive'", RelativeLayout.class);
    target.llBottom = Utils.findRequiredViewAsType(source, R.id.ll_bottom, "field 'llBottom'", LinearLayout.class);
    target.tvHome = Utils.findRequiredViewAsType(source, R.id.tv_home, "field 'tvHome'", TextView.class);
    target.tvShtick = Utils.findRequiredViewAsType(source, R.id.tv_shtick, "field 'tvShtick'", TextView.class);
    target.tvOrder = Utils.findRequiredViewAsType(source, R.id.tv_order, "field 'tvOrder'", TextView.class);
    target.tvPersonal = Utils.findRequiredViewAsType(source, R.id.tv_personal, "field 'tvPersonal'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.vpMain = null;
    target.home = null;
    target.rlOne = null;
    target.shtick = null;
    target.rlTwo = null;
    target.jiahao = null;
    target.rlThree = null;
    target.order = null;
    target.rlFor = null;
    target.personal = null;
    target.rlFive = null;
    target.llBottom = null;
    target.tvHome = null;
    target.tvShtick = null;
    target.tvOrder = null;
    target.tvPersonal = null;
  }
}
