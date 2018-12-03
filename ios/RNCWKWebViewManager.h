/**
 * Copyright (c) 2015-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

#import <React/RCTViewManager.h>

@interface RNCWKWebViewManager : RCTViewManager

(void) presentAlertOnController:(nonnull UIViewController*)parentController title:(nullable NSString*)title message:(nullable NSString *)message handler:(nonnull void (^)())completionHandler;
(void) presentConfirmOnController:(nonnull UIViewController*)parentController title:(nullable NSString*)title message:(nullable NSString *)message handler:(nonnull void (^)(BOOL result))completionHandler;
(void) presentPromptOnController:(nonnull UIViewController*)parentController title:(nullable NSString*)title message:(nullable NSString *)message defaultText:(nullable NSString*)defaultText handler:(nonnull void (^)(NSString * __nullable result))completionHandler;

@end
