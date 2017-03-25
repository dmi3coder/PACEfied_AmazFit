// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainRecordDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainRecordDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492943, "field 'myTrainTitle'");
    target.myTrainTitle = finder.castView(view, 2131492943, "field 'myTrainTitle'");
    view = finder.findRequiredView(source, 2131492945, "field 'trainProgress'");
    target.trainProgress = finder.castView(view, 2131492945, "field 'trainProgress'");
    view = finder.findRequiredView(source, 2131492948, "field 'trainDays'");
    target.trainDays = finder.castView(view, 2131492948, "field 'trainDays'");
    view = finder.findRequiredView(source, 2131492950, "field 'trainMils'");
    target.trainMils = finder.castView(view, 2131492950, "field 'trainMils'");
    view = finder.findRequiredView(source, 2131492951, "field 'listTrainWeeklys'");
    target.listTrainWeeklys = finder.castView(view, 2131492951, "field 'listTrainWeeklys'");
    view = finder.findRequiredView(source, 2131492928, "field 'll_scrollView'");
    target.ll_scrollView = finder.castView(view, 2131492928, "field 'll_scrollView'");
    view = finder.findRequiredView(source, 2131492946, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131492946, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131492937, "field 'trainMileage'");
    target.trainMileage = finder.castView(view, 2131492937, "field 'trainMileage'");
    view = finder.findRequiredView(source, 2131492952, "field 'txtTrainFinish' and method 'finishTrainRecord'");
    target.txtTrainFinish = finder.castView(view, 2131492952, "field 'txtTrainFinish'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.finishTrainRecord();
        }
      });
  }

  @Override public void unbind(T target) {
    target.myTrainTitle = null;
    target.trainProgress = null;
    target.trainDays = null;
    target.trainMils = null;
    target.listTrainWeeklys = null;
    target.ll_scrollView = null;
    target.progressBar = null;
    target.trainMileage = null;
    target.txtTrainFinish = null;
  }
}
