// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainRecordDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainRecordDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492940, "field 'myTrainTitle'");
    target.myTrainTitle = finder.castView(view, 2131492940, "field 'myTrainTitle'");
    view = finder.findRequiredView(source, 2131492942, "field 'trainProgress'");
    target.trainProgress = finder.castView(view, 2131492942, "field 'trainProgress'");
    view = finder.findRequiredView(source, 2131492945, "field 'trainDays'");
    target.trainDays = finder.castView(view, 2131492945, "field 'trainDays'");
    view = finder.findRequiredView(source, 2131492947, "field 'trainMils'");
    target.trainMils = finder.castView(view, 2131492947, "field 'trainMils'");
    view = finder.findRequiredView(source, 2131492948, "field 'listTrainWeeklys'");
    target.listTrainWeeklys = finder.castView(view, 2131492948, "field 'listTrainWeeklys'");
    view = finder.findRequiredView(source, 2131492926, "field 'll_scrollView'");
    target.ll_scrollView = finder.castView(view, 2131492926, "field 'll_scrollView'");
    view = finder.findRequiredView(source, 2131492943, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131492943, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131492949, "field 'txtTrainFinish' and method 'finishTrainRecord'");
    target.txtTrainFinish = finder.castView(view, 2131492949, "field 'txtTrainFinish'");
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
    target.txtTrainFinish = null;
  }
}
