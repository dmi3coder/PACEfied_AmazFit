// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainWidgetRemindActivity$$ViewBinder<T extends com.huami.watch.train.ui.activity.TrainWidgetRemindActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492884, "field 'train_record_title'");
    target.train_record_title = finder.castView(view, 2131492884, "field 'train_record_title'");
    view = finder.findRequiredView(source, 2131492885, "field 'train_plan_remind'");
    target.train_plan_remind = finder.castView(view, 2131492885, "field 'train_plan_remind'");
    view = finder.findRequiredView(source, 2131492886, "method 'clickToAssignPlan'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickToAssignPlan();
        }
      });
  }

  @Override public void unbind(T target) {
    target.train_record_title = null;
    target.train_plan_remind = null;
  }
}
