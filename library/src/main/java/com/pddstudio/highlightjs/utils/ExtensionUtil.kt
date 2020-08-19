package com.pddstudio.highlightjs.utils

import com.pddstudio.highlightjs.models.Language

object ExtensionUtil {
    @Suppress("SpellCheckingInspection")
    private val extToLangMap = mapOf (
            "1c"           to  Language._1C,
            "abnf"         to  Language.ABNF,
            "accesslog"    to  Language.ACCESS_LOGS,
            "ada"          to  Language.ADA,
            "armasm"       to  Language.ARM_ASSEMBLER,
            "arm"          to  Language.ARM_ASSEMBLER,
            "avrasm"       to  Language.AVR_ASSEMBLER,
            "apache"       to  Language.APACHE,
            "apacheconf"   to  Language.APACHE,
            "as"           to  Language.ACTION_SCRIPT,
            "applescript"  to  Language.APPLE_SCRIPT,
            "osascript"    to  Language.APPLE_SCRIPT,
            "asciidoc"     to  Language.ASCII_DOC,
            "adoc"         to  Language.ASCII_DOC,
            "aspectj"      to  Language.ASPECT_J,
            "autohotkey"   to  Language.AUTO_HOTKEY,
            "autoit"       to  Language.AUTO_IT,
            "axapta"       to  Language.AXAPTA,
            "bash"         to  Language.BASH,
            "sh"           to  Language.SHELL,
            "zsh"          to  Language.ZSH,
            "basic"        to  Language.BASIC,
            "bnf"          to  Language.BNF,
            "bf"           to  Language.BRAINFUCK,
            "brainfuck"    to  Language.BRAINFUCK,
            "cs"           to  Language.C_SHARP,
            "csharp"       to  Language.C_SHARP,
            "cpp"          to  Language.C_PLUS_PLUS,
            "c"            to  Language.C_PLUS_PLUS,
            "cc"           to  Language.C_PLUS_PLUS,
            "h"            to  Language.C_PLUS_PLUS,
            "c++"          to  Language.C_PLUS_PLUS,
            "h++"          to  Language.C_PLUS_PLUS,
            "hpp"          to  Language.C_PLUS_PLUS,
            "cal"          to  Language.C_AL,
            "cls"          to  Language.CACHE_OBJECT_SCRIPT,
            "cos"          to  Language.CACHE_OBJECT_SCRIPT,
            "cmake"        to  Language.C_MAKE,
            "cmake.in"     to  Language.C_MAKE,
            "coq"          to  Language.COQ,
            "csp"          to  Language.CSP,
            "css"          to  Language.CSS,
            "capnp"        to  Language.CAPTAIN_PROTO,
            "capnproto"    to  Language.CAPTAIN_PROTO,
            "chaos"        to  Language.CHAOS,
            "clean"        to  Language.CLEAN,
            "clojure"      to  Language.CLOJURE,
            "clj"          to  Language.CLOJURE,
            "coffeescript" to  Language.COFFEE_SCRIPT,
            "coffee"       to  Language.COFFEE_SCRIPT,
            "iced"         to  Language.COFFEE_SCRIPT,
            "cson"         to  Language.COFFEE_SCRIPT,
            "cpc"          to  Language.CPCDOSC_PLUS,
            "crmsh"        to  Language.CRMSH,
            "crm"          to  Language.CRMSH,
            "pcmk"         to  Language.CRMSH,
            "crystal"      to  Language.CRYSTAL,
            "cr"           to  Language.CRYSTAL,
            "cypher"       to  Language.CYPHER_NEO4J,
            "cql"          to  Language.CYPHER_NEO4J,
            "d"            to  Language.D,
            "dns"          to  Language.DNS_ZONE_FILE,
            "zone"         to  Language.DNS_ZONE_FILE,
            "bind"         to  Language.DNS_ZONE_FILE,
            "dos"          to  Language.DOS,
            "bat"          to  Language.BATCH,
            "cmd"          to  Language.DOS,
            "dart"         to  Language.DART,
            "delphi"       to  Language.DELPHI,
            "dpr"          to  Language.DELPHI,
            "dfm"          to  Language.DELPHI,
            "pas"          to  Language.DELPHI,
            "pascal"       to  Language.DELPHI,
            "freepascal"   to  Language.DELPHI,
            "lazarus"      to  Language.DELPHI,
            "lpr"          to  Language.DELPHI,
            "lfm"          to  Language.DELPHI,
            "diff"         to  Language.DIFF,
            "patch"        to  Language.DIFF,
            "django"       to  Language.DJANGO,
            "jinja"        to  Language.DJANGO,
            "dockerfile"   to  Language.DOCKER_FILE,
            "docker"       to  Language.DOCKER_FILE,
            "dsconfig"     to  Language.DSCONFIG,
            "dts"          to  Language.DTS,
            "dust"         to  Language.DUST,
            "dst"          to  Language.DUST,
            "dylan"        to  Language.DYLAN,
            "ebnf"         to  Language.EBNF,
            "elixir"       to  Language.ELIXIR,
            "elm"          to  Language.ELM,
            "erlang"       to  Language.ERLANG,
            "erl"          to  Language.ERLANG,
            "excel"        to  Language.EXCEL,
            "xls"          to  Language.EXCEL,
            "xlsx"         to  Language.EXCEL,
            "fsharp"       to  Language.F_SHARP,
            "fs"           to  Language.F_SHARP,
            "fix"          to  Language.FIX,
            "flix"         to  Language.FLIX,
            "fortran"         to  Language.FORTRAN,
            "f90"             to  Language.FORTRAN,
            "f95"             to  Language.FORTRAN,
            "gcode"           to  Language.G_CODE,
            "nc"              to  Language.G_CODE,
            "gams"            to  Language.GAMS,
            "gms"             to  Language.GAMS,
            "gauss"           to  Language.GAUSS,
            "gss"             to  Language.GAUSS,
            "el"              to  Language.GDSCRIPT,
            "gherkin"         to  Language.GHERKIN,
            "golang"          to  Language.GO,
            "go"              to  Language.GO,
            "gn"              to  Language.GN_FOR_NINJA,
            "gf"              to  Language.GRAMMATICAL_FRAMEWORK,
            "golo"            to  Language.GOLO,
            "gololang"        to  Language.GOLO,
            "gradle"          to  Language.GRADLE,
            "groovy"          to  Language.GROOVY,
            "html"            to  Language.HTML,
            "xhtml"           to  Language.HTML,
            "xml"             to  Language.XML,
            "rss"             to  Language.XML,
            "atom"            to  Language.XML,
            "xjb"             to  Language.XML,
            "xsd"             to  Language.XML,
            "xsl"             to  Language.XML,
            "list"            to  Language.XML,
            "http"            to  Language.HTTP,
            "https"           to  Language.HTTP,
            "haml"            to  Language.HAML,
            "handlebars"      to  Language.HANDLEBARS,
            "hbs"             to  Language.HANDLEBARS,
            "html.hbs"        to  Language.HANDLEBARS,
            "html.handlebars" to  Language.HANDLEBARS,
            "haskell"         to  Language.HASKELL,
            "hs"              to  Language.HASKELL,
            "haxe"            to  Language.HAXE,
            "hx"              to  Language.HAXE,
            "hy"              to  Language.HY,
            "hylang"          to  Language.HY,
            "ini"             to  Language.INI,
            "inform7"         to  Language.INFORM7,
            "i7"              to  Language.INFORM7,
            "irpf90"          to  Language.IRPF90,
            "json"            to  Language.JSON,
            "jsp0"            to  Language.JAVA,
            "java"            to  Language.JAVA,
            "js"              to  Language.JAVA_SCRIPT,
            "ol"              to  Language.JOLIE,
            "kt"              to  Language.KOTLIN,
            "kts"             to  Language.KOTLIN,
            "tex"             to  Language.LATEX,
            "lasso"           to  Language.LASSO,
            "ls"              to  Language.LASSO,
            "lassoscript"     to  Language.LASSO,
            "leaf"            to  Language.LEAF,
            "lean"            to  Language.LEAN,
            "less"            to  Language.LESS,
            "ldif"            to  Language.LDIF,
            "lisp"            to  Language.LISP,
            "livecodeserver"  to  Language.LIVE_CODE_SERVER,
            "livescript"      to  Language.LIVE_SCRIPT,
            "ls"              to  Language.LIVE_SCRIPT,
            "ll"              to  Language.LLVM,
            "bc"              to  Language.LLVM,
            "lua"             to  Language.LUA,
            "makefile"        to  Language.MAKEFILE,
            "mk"              to  Language.MAKEFILE,
            "mak"             to  Language.MAKEFILE,
            "markdown"        to  Language.MARKDOWN,
            "md"              to  Language.MARKDOWN,
            "mkdown"          to  Language.MARKDOWN,
            "mkd"             to  Language.MARKDOWN,
            "mathematica"     to  Language.MATHEMATICA,
            "mms"             to  Language.MATHEMATICA,
            "matlab"          to  Language.MATLAB,
            "maxima"          to  Language.MAXIMA,
            "mel"             to  Language.MAYA_EMBEDDED_LANGUAGE,
            "mercury"         to  Language.MERCURY,
            "mrc"             to  Language.MIRC_SCRIPTING_LANGUAGE,
            "mizar"           to  Language.MIZAR,
            "mojolicious"     to  Language.MOJOLICIOUS,
            "monkey"          to  Language.MONKEY,
            "moonscript"      to  Language.MOONSCRIPT,
            "moon"            to  Language.MOONSCRIPT,
            "n1ql"            to  Language.N1QL,
            "nsis"            to  Language.NSIS,
            "nginxconf"       to  Language.NGINX,
            "nginx"           to  Language.NGINX,
            "nim"             to  Language.NIMROD,
            "nimrod"          to  Language.NIMROD,
            "nix"             to  Language.NIX,
            "ocl"             to  Language.OBJECTIVE_CONSTRAINT_LANGUAGE,
            "ocaml"           to  Language.O_CAML,
            "ml"              to  Language.O_CAML,
            "objectivec"      to  Language.OBJECTIVE_C,
            "mm"              to  Language.OBJECTIVE_C,
            "objc"            to  Language.OBJECTIVE_C,
            "obj-c"           to  Language.OBJECTIVE_C,
            "glsl"            to  Language.OPENGL_SHADING_LANGUAGE,
            "openscad"        to  Language.OPEN_SCAD,
            "scad"            to  Language.OPEN_SCAD,
            "ruleslanguage"   to  Language.ORACLE_RULES_LANGUAGE,
            "oxygene"         to  Language.OXYGENE,
            "pf.conf"         to  Language.PF,
            "pf"              to  Language.PF,
            "php"             to  Language.PHP,
            "php3"            to  Language.PHP,
            "php4"            to  Language.PHP,
            "php5"            to  Language.PHP,
            "php6"            to  Language.PHP,
            "php7"            to  Language.PHP,
            "parser3"         to  Language.PARSER3,
            "perl"            to  Language.PERL,
            "pl"              to  Language.PERL,
            "pm"              to  Language.PERL,
            "txt"             to  Language.PLAIN_TEXT,
            "pony"            to  Language.PONY,
            "powershell"      to  Language.POWER_SHELL,
            "ps"              to  Language.POWER_SHELL,
            "processing"      to  Language.PROCESSING,
            "prolog"          to  Language.PROLOG,
            "properties"      to  Language.PROPERTIES,
            "protobuf"        to  Language.PROTOCOL_BUFFERS,
            "puppet"          to  Language.PUPPET,
            "pp"              to  Language.PUPPET,
            "python"          to  Language.PYTHON,
            "py"              to  Language.PYTHON,
            "gyp"             to  Language.PYTHON,
            "profile"         to  Language.PYTHON_PROFILER_RESULTS,
            "pycon"           to  Language.PYTHON_REPL,
            "k"               to  Language.Q,
            "kdb"             to  Language.Q,
            "qml"             to  Language.QML,
            "r"               to  Language.R,
            "cshtml"          to  Language.RAZOR_CSHTML,
            "vbhtml"          to  Language.RAZOR_CSHTML,
            "re"              to  Language.REASON_ML,
            "rei"             to  Language.REASON_ML,
            "rib"             to  Language.RENDER_MAN_RIB,
            "rsl"             to  Language.RENDER_MAN_RSL,
            "graph"           to  Language.ROBOCONF,
            "instances"       to  Language.ROBOCONF,
            "ruby"            to  Language.RUBY,
            "rb"              to  Language.RUBY,
            "gemspec"         to  Language.RUBY,
            "podspec"         to  Language.RUBY,
            "thor"            to  Language.RUBY,
            "irb"             to  Language.RUBY,
            "rust"            to  Language.RUST,
            "rs"              to  Language.RUST,
            "sas"             to  Language.SAS,
            "scss"            to  Language.SCSS,
            "sql"             to  Language.SQL,
            "p21"             to  Language.STEP_PART_21,
            "step"            to  Language.STEP_PART_21,
            "stp"             to  Language.STEP_PART_21,
            "scala"           to  Language.SCALA,
            "scheme"          to  Language.SCHEME,
            "scilab"          to  Language.SCILAB,
            "sci"             to  Language.SCILAB,
            "smali"           to  Language.SMALI,
            "samlltalk"       to  Language.SMALLTALK,
            "st"              to  Language.SMALLTALK,
            "stan"            to  Language.STAN,
            "stata"           to  Language.STATA,
            "stylus"          to  Language.STYLUS,
            "styl"            to  Language.STYLUS,
            "subunit"         to  Language.SUB_UNIT,
            "swift"           to  Language.SWIFT,
            "tap"             to  Language.TEST_ANYTHING_PROTOCOL,
            "tcl"             to  Language.TCL,
            "tk"              to  Language.TCL,
            "tex"             to  Language.TEX,
            "thrift"          to  Language.THRIFT,
            "tp"              to  Language.TP,
            "twig"            to  Language.TWIG,
            "craftcms"        to  Language.TWIG,
            "typescript"      to  Language.TYPE_SCRIPT,
            "ts"              to  Language.TYPE_SCRIPT,
            "vbnet"           to  Language.VB_NET,
            "vb"              to  Language.VB_NET,
            "vbscript"        to  Language.VB_SCRIPT,
            "vbs"             to  Language.VB_SCRIPT,
            "vhdl"            to  Language.VHDL,
            "vala"            to  Language.VALA,
            "verilog"         to  Language.VERILOG,
            "v"               to  Language.VERILOG,
            "vim"             to  Language.VIM,
            "x86asm"          to  Language.X86_ASSEMBLY,
            "xl"              to  Language.XL,
            "tao"             to  Language.XL,
            "xpath"           to  Language.X_QUERY,
            "xq"              to  Language.X_QUERY,
            "zephir"          to  Language.ZEPHIR,
            "zep"             to  Language.ZEPHIR
    )

    fun getLanguageByExtension(extension: String): Language =
            extToLangMap[extension] ?: Language.AUTO_DETECT
}