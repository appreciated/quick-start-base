package com.github.appreciated.quickstart.base.navigation.interfaces;

import javax.xml.ws.Holder;

/**
 * Created by Johannes on 19.03.2017.
 */
public interface Finishable extends Subpage {
    Holder<FinishListener> listener = new Holder<>();

    default void setFinishListener(FinishListener finishListener) {
        listener.value = finishListener;
    }

    default void finish() {
        if (listener.value != null) {
            listener.value.onFinish();
        }
    }

    public interface FinishListener {
        public void onFinish();
    }
}


