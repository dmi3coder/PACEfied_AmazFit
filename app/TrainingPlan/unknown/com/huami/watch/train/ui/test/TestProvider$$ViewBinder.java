// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.test;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TestProvider$$ViewBinder<T extends com.huami.watch.train.ui.test.TestProvider> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492881, "method 'testSendNofication'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.testSendNofication();
        }
      });
  }

  @Override public void unbind(T target) {
  }
}
