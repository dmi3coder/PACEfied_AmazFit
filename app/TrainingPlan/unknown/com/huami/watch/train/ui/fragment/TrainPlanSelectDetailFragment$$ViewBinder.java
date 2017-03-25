// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanSelectDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainPlanSelectDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492928, "field 'fullScrollView'");
    target.fullScrollView = finder.castView(view, 2131492928, "field 'fullScrollView'");
    view = finder.findRequiredView(source, 2131492936, "field 'numberTrainDays'");
    target.numberTrainDays = finder.castView(view, 2131492936, "field 'numberTrainDays'");
    view = finder.findRequiredView(source, 2131492938, "field 'numberTrainMils'");
    target.numberTrainMils = finder.castView(view, 2131492938, "field 'numberTrainMils'");
    view = finder.findRequiredView(source, 2131492937, "field 'trainMileage'");
    target.trainMileage = finder.castView(view, 2131492937, "field 'trainMileage'");
    view = finder.findRequiredView(source, 2131492941, "field 'recyclerView_history'");
    target.recyclerView_history = finder.castView(view, 2131492941, "field 'recyclerView_history'");
    view = finder.findRequiredView(source, 2131492939, "method 'startNewTrainPlan'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startNewTrainPlan();
        }
      });
  }

  @Override public void unbind(T target) {
    target.fullScrollView = null;
    target.numberTrainDays = null;
    target.numberTrainMils = null;
    target.trainMileage = null;
    target.recyclerView_history = null;
  }
}
