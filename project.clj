(defproject dullest-bot "0.1.0-SNAPSHOT"
  :description "World's dullest bot"
  :url "https://twitter.com/DullestBot"
  :license {:name "GNU General Public License"
            :url "https://www.gnu.org/licenses/#GPL"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot dullest-bot.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
