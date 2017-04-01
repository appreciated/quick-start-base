package com.github.appreciated.quickstart.base.navigation.interfaces;

import com.github.appreciated.quickstart.base.navigation.actions.Action;

import javax.xml.ws.Holder;
import java.util.List;

/**
 * Created by appreciated on 11.12.2016.
 */
public interface HasContextActions {
    Holder<ContextActionListener> listener = new Holder<>();

    default void setContextActionListener(ContextActionListener finishListener) {
        listener.value = finishListener;
    }

    List<Action> getContextActions();

    default void updateContextActions() {
        if (listener.value != null) {
            listener.value.onUpdate();
        }
    }

    interface ContextActionListener {
        void onUpdate();
    }
}