// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainWeeklyRecordDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainWeeklyRecordDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492884, "field 'trainRecordTitle'");
    target.trainRecordTitle = finder.castView(view, 2131492884, "field 'trainRecordTitle'");
    view = finder.findRequiredView(source, 2131492958, "field 'currentWeekNumber'");
    target.currentWeekNumber = finder.castView(view, 2131492958, "field 'currentWeekNumber'");
    view = finder.findRequiredView(source, 2131492959, "field 'recyclearView'");
    target.recyclearView = finder.castView(view, 2131492959, "field 'recyclearView'");
    view = finder.findRequiredView(source, 2131492876, "field 'fullScrollView'");
    target.fullScrollView = finder.castView(view, 2131492876, "field 'fullScrollView'");
  }

  @Override public void unbind(T target) {
    target.trainRecordTitle = null;
    target.currentWeekNumber = null;
    target.recyclearView = null;
    target.fullScrollView = null;
  }
}
