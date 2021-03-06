(ns proton.layers.tools.linter.core
  (:require [proton.lib.helpers :as helpers])
  (:use [proton.layers.base :only [init-layer! get-initial-config get-keybindings get-packages get-keymaps describe-mode]]))

(defmethod init-layer! :tools/linter
  [_ {:keys [config layers]}]
  (helpers/console! "init" :tools/linter))

(defmethod get-packages :tools/linter []
  [:linter])

(defmethod get-keybindings :tools/linter [] []
  {:e {:category "errors"
       :t {:action "linter:toggle"
           :title "toggle linter"}
       :n {:action "linter:next-error"
           :title "next error"}
       :p {:action "linter:previous-error"
           :title "previous error"}
       :l {:action "linter:lint"
           :title "lint now"}
       :T {:action "linter:togglePanel"
           :title "toggle panel"}}})


(defmethod describe-mode :tools/linter [] {})
(defmethod get-keymaps :tools/linter [] [])
(defmethod get-initial-config :tools/linter [] [])
