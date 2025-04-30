(defproject xyz.zcaudate/rt-equo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [xyz.zcaudate/code.test           "4.0.9"]
                 [xyz.zcaudate/code.manage         "4.0.9"]
                 [xyz.zcaudate/code.java           "4.0.9"]
                 [xyz.zcaudate/code.maven          "4.0.9"]
                 [xyz.zcaudate/code.doc            "4.0.9"]
                 [xyz.zcaudate/code.dev            "4.0.9"]
                 [xyz.zcaudate/net.http            "4.0.9"]
                 [xyz.zcaudate/rt.basic            "4.0.9"]
                 [xyz.zcaudate/std.lib             "4.0.9"]
                 [xyz.zcaudate/std.log             "4.0.9"]
                 [xyz.zcaudate/std.lang            "4.0.9"]
                 [xyz.zcaudate/xtalk.lang          "4.0.9"]
                 
                 [dev.equo/dev.equo.sdk "0.0.2"]
                 [com.equo/com.equo.chromium.cef.cocoa.macosx.aarch64 "116.0.6"]]
  :repositories [["chromium-swt-ee" "https://dl.equo.dev/chromium-swt-ee/equo-gpl/mvn"]])
