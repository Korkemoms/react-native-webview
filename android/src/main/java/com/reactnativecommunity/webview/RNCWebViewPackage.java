
package com.reactnativecommunity.webview;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.JavaScriptModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class RNCWebViewPackage implements ReactPackage {

  private RNCWebViewManager manager;
  private RNCWebViewModule module;

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();
    module = new RNCWebViewModule(reactContext);
    module.setPackage(this);
    modules.add(module);
    return modules;
  }

  // Deprecated from RN 0.47
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    manager = new RNCWebViewManager();
    manager.setPackage(this);
    return Arrays.<ViewManager>asList(manager);
  }

  public RNCWebViewManager getManager() {
    return manager;
  }

  public RNCWebViewModule getModule() {
    return module;
  }
}