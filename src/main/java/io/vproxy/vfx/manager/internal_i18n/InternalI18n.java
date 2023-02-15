package io.vproxy.vfx.manager.internal_i18n;

import io.vproxy.vfx.util.Singleton;

public interface InternalI18n {
    static InternalI18n get() {
        return Singleton.registerIfAbsent(InternalI18n.class, () -> new InternalI18n() {
        });
    }

    default String cancelButton() {
        return "Cancel";
    }

    default String alertInfoTitle() {
        return "Info";
    }

    default String alertWarningTitle() {
        return "Warning";
    }

    default String alertErrorTitle() {
        return "Error";
    }

    default String alertOkButton() {
        return "Ok";
    }

    default String confirmationYesButton() {
        return "Yes";
    }

    default String confirmationNoButton() {
        return "No";
    }

    default String cannotFindAnyDisplay() {
        return "cannot find any display";
    }

    default String stacktraceAlertTitle() {
        return "Exception";
    }

    default String stacktraceAlertHeaderText() {
        return "Exception Thrown";
    }

    default String stacktraceAlertLabel() {
        return "The exception stacktrace was:";
    }

    default String keyChooserLeftMouseButton() {
        return "Left mouse button";
    }

    default String keyChooserRightMouseButton() {
        return "Right mouse button";
    }

    default String keyChooserDesc() {
        return "Please press the key you want to use, or click the buttons to choose left or right mouse button.";
    }

    default String keyChooserDescWithoutMouse() {
        return "Please press the key you want to use.";
    }

    default String emptyTableLabel() {
        return "No Data";
    }

    default String sceneGroupPreCheckShowSceneFailed() {
        return "An exception occurred when trying to show the scene.";
    }
}
