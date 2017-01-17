// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainSelectDetailAdapter$ViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainSelectDetailAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492882, "field 'trainRecordTitle'");
    target.trainRecordTitle = finder.castView(view, 2131492882, "field 'trainRecordTitle'");
    view = finder.findRequiredView(source, 2131492886, "field 'txtStartDate'");
    target.txtStartDate = finder.castView(view, 2131492886, "field 'txtStartDate'");
    view = finder.findRequiredView(source, 2131492887, "field 'txtEndDate'");
    target.txtEndDate = finder.castView(view, 2131492887, "field 'txtEndDate'");
    view = finder.findRequiredView(source, 2131492888, "field 'circleProgressView'");
    target.circleProgressView = finder.castView(view, 2131492888, "field 'circleProgressView'");
    view = finder.findRequiredView(source, 2131492889, "field 'txtProgressLevel'");
    target.txtProgressLevel = finder.castView(view, 2131492889, "field 'txtProgressLevel'");
  }

  @Override public void unbind(T target) {
    target.trainRecordTitle = null;
    target.txtStartDate = null;
    target.txtEndDate = null;
    target.circleProgressView = null;
    target.txtProgressLevel = null;
  }
}
