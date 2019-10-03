java_library(
  name = 'COMPILE',
  visibility = ['PUBLIC'],
  exported_deps = [
    ':com.google.closure-stylesheets-closure-stylesheets-jar',
    ':args4j-args4j-jar',
    ':org.easymock-easymock-jar',
    ':cglib-cglib-nodep-jar',
    ':com.google.code.gson-gson-jar',
    ':net.java.dev.javacc-javacc-jar',
    ':com.google.code.findbugs-jsr305-jar',
    ':com.google.template-soy-jar',
    ':javax.inject-javax.inject-jar',
    ':com.google.inject-guice-jar',
    ':aopalliance-aopalliance-jar',
    ':com.google.inject.extensions-guice-multibindings-jar',
    ':com.google.guava-guava-jar',
    ':com.google.common.html.types-types-jar',
    ':com.google.gwt-gwt-user-jar',
    ':javax.validation-validation-api-jar',
    ':javax.validation-validation-api-sources',
    ':javax.annotation-jsr250-api-jar',
    ':com.google.protobuf-protobuf-java-jar',
    ':org.ow2.asm-asm-jar',
    ':org.ow2.asm-asm-commons-jar',
    ':org.ow2.asm-asm-tree-jar',
    ':org.ow2.asm-asm-util-jar',
    ':org.ow2.asm-asm-analysis-jar',
    ':com.ibm.icu-icu4j-jar',
    ':org.json-json-jar',
    ':com.google.javascript-closure-compiler-jar',
    ':com.google.javascript-closure-compiler-externs-jar',
    ':com.google.errorprone-error_prone_annotations-jar',
    ':com.google.jsinterop-jsinterop-annotations-jar',
    ':com.google.re2j-re2j-jar',
    ':org.seleniumhq.selenium-selenium-java-jar',
    ':org.seleniumhq.selenium-selenium-android-driver-jar',
    ':org.seleniumhq.selenium-selenium-remote-driver-jar',
    ':org.seleniumhq.selenium-selenium-chrome-driver-jar',
    ':org.seleniumhq.selenium-selenium-htmlunit-driver-jar',
    ':org.seleniumhq.selenium-selenium-api-jar',
    ':net.sourceforge.htmlunit-htmlunit-jar',
    ':xalan-xalan-jar',
    ':xalan-serializer-jar',
    ':commons-collections-commons-collections-jar',
    ':commons-lang-commons-lang-jar',
    ':org.apache.httpcomponents-httpmime-jar',
    ':commons-codec-commons-codec-jar',
    ':net.sourceforge.htmlunit-htmlunit-core-js-jar',
    ':xerces-xercesImpl-jar',
    ':xml-apis-xml-apis-jar',
    ':net.sourceforge.nekohtml-nekohtml-jar',
    ':net.sourceforge.cssparser-cssparser-jar',
    ':org.w3c.css-sac-jar',
    ':commons-logging-commons-logging-jar',
    ':org.apache.httpcomponents-httpclient-jar',
    ':org.apache.httpcomponents-httpcore-jar',
    ':org.seleniumhq.selenium-selenium-firefox-driver-jar',
    ':commons-io-commons-io-jar',
    ':org.apache.commons-commons-exec-jar',
    ':org.seleniumhq.selenium-selenium-ie-driver-jar',
    ':net.java.dev.jna-jna-jar',
    ':net.java.dev.jna-platform-jar',
    ':org.seleniumhq.selenium-selenium-iphone-driver-jar',
    ':org.seleniumhq.selenium-selenium-safari-driver-jar',
    ':org.seleniumhq.selenium-selenium-support-jar',
    ':org.webbitserver-webbit-jar',
    ':org.jboss.netty-netty-jar',
    ':org.objenesis-objenesis-jar'
  ],
)

java_library(
  name = 'OPTIONAL',
  visibility = ['PUBLIC'],
  exported_deps = [
    
  ],
)

java_library(
  name = 'PROVIDED',
  visibility = ['PUBLIC'],
  exported_deps = [
    
  ],
)

java_library(
  name = 'RUNTIME',
  visibility = ['PUBLIC'],
  exported_deps = [
    
  ],
)

java_library(
  name = 'TEST',
  visibility = ['PUBLIC'],
  exported_deps = [
    ':junit-junit-jar',
    ':org.hamcrest-hamcrest-core-jar',
    ':org.mockito-mockito-core-jar'
  ],
)

prebuilt_jar(
  name = 'aopalliance-aopalliance-jar',
  binary_jar = ':remote-aopalliance-aopalliance-jar',
)

remote_file(
  name = 'remote-aopalliance-aopalliance-jar',
  out = 'aopalliance-aopalliance-jar-1.0.jar',
  url = 'mvn:aopalliance:aopalliance:jar:1.0',
  sha1 = '0235ba8b489512805ac13a8f9ea77a1ca5ebe3e8',
)

prebuilt_jar(
  name = 'args4j-args4j-jar',
  binary_jar = ':remote-args4j-args4j-jar',
)

remote_file(
  name = 'remote-args4j-args4j-jar',
  out = 'args4j-args4j-jar-2.0.26.jar',
  url = 'mvn:args4j:args4j:jar:2.0.26',
  sha1 = '01ebb18ebb3b379a74207d5af4ea7c8338ebd78b',
)

prebuilt_jar(
  name = 'cglib-cglib-nodep-jar',
  binary_jar = ':remote-cglib-cglib-nodep-jar',
)

remote_file(
  name = 'remote-cglib-cglib-nodep-jar',
  out = 'cglib-cglib-nodep-jar-2.2.jar',
  url = 'mvn:cglib:cglib-nodep:jar:2.2',
  sha1 = '59afed7ab65e7ec6585d5bc60556c3cbd203532b',
)

prebuilt_jar(
  name = 'com.google.closure-stylesheets-closure-stylesheets-jar',
  binary_jar = ':remote-com.google.closure-stylesheets-closure-stylesheets-jar',
)

remote_file(
  name = 'remote-com.google.closure-stylesheets-closure-stylesheets-jar',
  out = 'com.google.closure-stylesheets-closure-stylesheets-jar-1.5.0.jar',
  url = 'mvn:com.google.closure-stylesheets:closure-stylesheets:jar:1.5.0',
  sha1 = '0d2b1c0dcba2ac4e13f28721f89134f7333fed2c',
)

prebuilt_jar(
  name = 'com.google.code.findbugs-jsr305-jar',
  binary_jar = ':remote-com.google.code.findbugs-jsr305-jar',
)

remote_file(
  name = 'remote-com.google.code.findbugs-jsr305-jar',
  out = 'com.google.code.findbugs-jsr305-jar-3.0.1.jar',
  url = 'mvn:com.google.code.findbugs:jsr305:jar:3.0.1',
  sha1 = 'f7be08ec23c21485b9b5a1cf1654c2ec8c58168d',
)

prebuilt_jar(
  name = 'com.google.code.gson-gson-jar',
  binary_jar = ':remote-com.google.code.gson-gson-jar',
)

remote_file(
  name = 'remote-com.google.code.gson-gson-jar',
  out = 'com.google.code.gson-gson-jar-2.7.jar',
  url = 'mvn:com.google.code.gson:gson:jar:2.7',
  sha1 = '751f548c85fa49f330cecbb1875893f971b33c4e',
)

prebuilt_jar(
  name = 'com.google.common.html.types-types-jar',
  binary_jar = ':remote-com.google.common.html.types-types-jar',
)

remote_file(
  name = 'remote-com.google.common.html.types-types-jar',
  out = 'com.google.common.html.types-types-jar-1.0.4.jar',
  url = 'mvn:com.google.common.html.types:types:jar:1.0.4',
  sha1 = '2adf4c8bfccc0ff7346f9186ac5aa57d829ad065',
)

prebuilt_jar(
  name = 'com.google.errorprone-error_prone_annotations-jar',
  binary_jar = ':remote-com.google.errorprone-error_prone_annotations-jar',
)

remote_file(
  name = 'remote-com.google.errorprone-error_prone_annotations-jar',
  out = 'com.google.errorprone-error_prone_annotations-jar-2.3.1.jar',
  url = 'mvn:com.google.errorprone:error_prone_annotations:jar:2.3.1',
  sha1 = 'a6a2b2df72fd13ec466216049b303f206bd66c5d',
)

prebuilt_jar(
  name = 'com.google.guava-guava-jar',
  binary_jar = ':remote-com.google.guava-guava-jar',
)

remote_file(
  name = 'remote-com.google.guava-guava-jar',
  out = 'com.google.guava-guava-jar-21.0.jar',
  url = 'mvn:com.google.guava:guava:jar:21.0',
  sha1 = '3a3d111be1be1b745edfa7d91678a12d7ed38709',
)

prebuilt_jar(
  name = 'com.google.gwt-gwt-user-jar',
  binary_jar = ':remote-com.google.gwt-gwt-user-jar',
)

remote_file(
  name = 'remote-com.google.gwt-gwt-user-jar',
  out = 'com.google.gwt-gwt-user-jar-2.8.0-beta1.jar',
  url = 'mvn:com.google.gwt:gwt-user:jar:2.8.0-beta1',
  sha1 = 'abea2e34826ce592e0d2bd49a844b2ff57b78134',
)

prebuilt_jar(
  name = 'com.google.inject-guice-jar',
  binary_jar = ':remote-com.google.inject-guice-jar',
)

remote_file(
  name = 'remote-com.google.inject-guice-jar',
  out = 'com.google.inject-guice-jar-4.1.0.jar',
  url = 'mvn:com.google.inject:guice:jar:4.1.0',
  sha1 = 'eeb69005da379a10071aa4948c48d89250febb07',
)

prebuilt_jar(
  name = 'com.google.inject.extensions-guice-multibindings-jar',
  binary_jar = ':remote-com.google.inject.extensions-guice-multibindings-jar',
)

remote_file(
  name = 'remote-com.google.inject.extensions-guice-multibindings-jar',
  out = 'com.google.inject.extensions-guice-multibindings-jar-4.1.0.jar',
  url = 'mvn:com.google.inject.extensions:guice-multibindings:jar:4.1.0',
  sha1 = '3b27257997ac51b0f8d19676f1ea170427e86d51',
)

prebuilt_jar(
  name = 'com.google.javascript-closure-compiler-jar',
  binary_jar = ':remote-com.google.javascript-closure-compiler-jar',
)

remote_file(
  name = 'remote-com.google.javascript-closure-compiler-jar',
  out = 'com.google.javascript-closure-compiler-jar-v20190929.jar',
  url = 'mvn:com.google.javascript:closure-compiler:jar:v20190929',
  sha1 = '693d096c805f5ab615957445038919adec11bf50',
)

prebuilt_jar(
  name = 'com.google.javascript-closure-compiler-externs-jar',
  binary_jar = ':remote-com.google.javascript-closure-compiler-externs-jar',
)

remote_file(
  name = 'remote-com.google.javascript-closure-compiler-externs-jar',
  out = 'com.google.javascript-closure-compiler-externs-jar-v20190929.jar',
  url = 'mvn:com.google.javascript:closure-compiler-externs:jar:v20190929',
  sha1 = '9fb7cc59b057efc5dcd98f16630fd65d371ac383',
)

prebuilt_jar(
  name = 'com.google.jsinterop-jsinterop-annotations-jar',
  binary_jar = ':remote-com.google.jsinterop-jsinterop-annotations-jar',
)

remote_file(
  name = 'remote-com.google.jsinterop-jsinterop-annotations-jar',
  out = 'com.google.jsinterop-jsinterop-annotations-jar-1.0.0.jar',
  url = 'mvn:com.google.jsinterop:jsinterop-annotations:jar:1.0.0',
  sha1 = '23c3a3c060ffe4817e67673cc8294e154b0a4a95',
)

prebuilt_jar(
  name = 'com.google.protobuf-protobuf-java-jar',
  binary_jar = ':remote-com.google.protobuf-protobuf-java-jar',
)

remote_file(
  name = 'remote-com.google.protobuf-protobuf-java-jar',
  out = 'com.google.protobuf-protobuf-java-jar-3.3.0.jar',
  url = 'mvn:com.google.protobuf:protobuf-java:jar:3.3.0',
  sha1 = '9f301d1a27501b1afcb2ed16aad428337dabf9e4',
)

prebuilt_jar(
  name = 'com.google.re2j-re2j-jar',
  binary_jar = ':remote-com.google.re2j-re2j-jar',
)

remote_file(
  name = 'remote-com.google.re2j-re2j-jar',
  out = 'com.google.re2j-re2j-jar-1.3.jar',
  url = 'mvn:com.google.re2j:re2j:jar:1.3',
  sha1 = 'dc7de2b32fa8cc569ab44fb849abadbbc6983b91',
)

prebuilt_jar(
  name = 'com.google.template-soy-jar',
  binary_jar = ':remote-com.google.template-soy-jar',
)

remote_file(
  name = 'remote-com.google.template-soy-jar',
  out = 'com.google.template-soy-jar-2018-03-14.jar',
  url = 'mvn:com.google.template:soy:jar:2018-03-14',
  sha1 = '76a1322705ba5a6d6329ee26e7387417725ce4b3',
)

prebuilt_jar(
  name = 'com.ibm.icu-icu4j-jar',
  binary_jar = ':remote-com.ibm.icu-icu4j-jar',
)

remote_file(
  name = 'remote-com.ibm.icu-icu4j-jar',
  out = 'com.ibm.icu-icu4j-jar-57.1.jar',
  url = 'mvn:com.ibm.icu:icu4j:jar:57.1',
  sha1 = '198ea005f41219f038f4291f0b0e9f3259730e92',
)

prebuilt_jar(
  name = 'commons-codec-commons-codec-jar',
  binary_jar = ':remote-commons-codec-commons-codec-jar',
)

remote_file(
  name = 'remote-commons-codec-commons-codec-jar',
  out = 'commons-codec-commons-codec-jar-1.4.jar',
  url = 'mvn:commons-codec:commons-codec:jar:1.4',
  sha1 = '4216af16d38465bbab0f3dff8efa14204f7a399a',
)

prebuilt_jar(
  name = 'commons-collections-commons-collections-jar',
  binary_jar = ':remote-commons-collections-commons-collections-jar',
)

remote_file(
  name = 'remote-commons-collections-commons-collections-jar',
  out = 'commons-collections-commons-collections-jar-3.2.1.jar',
  url = 'mvn:commons-collections:commons-collections:jar:3.2.1',
  sha1 = '761ea405b9b37ced573d2df0d1e3a4e0f9edc668',
)

prebuilt_jar(
  name = 'commons-io-commons-io-jar',
  binary_jar = ':remote-commons-io-commons-io-jar',
)

remote_file(
  name = 'remote-commons-io-commons-io-jar',
  out = 'commons-io-commons-io-jar-2.0.1.jar',
  url = 'mvn:commons-io:commons-io:jar:2.0.1',
  sha1 = '7ffdb02f95af1c1a208544e076cea5b8e66e731a',
)

prebuilt_jar(
  name = 'commons-lang-commons-lang-jar',
  binary_jar = ':remote-commons-lang-commons-lang-jar',
)

remote_file(
  name = 'remote-commons-lang-commons-lang-jar',
  out = 'commons-lang-commons-lang-jar-2.6.jar',
  url = 'mvn:commons-lang:commons-lang:jar:2.6',
  sha1 = '0ce1edb914c94ebc388f086c6827e8bdeec71ac2',
)

prebuilt_jar(
  name = 'commons-logging-commons-logging-jar',
  binary_jar = ':remote-commons-logging-commons-logging-jar',
)

remote_file(
  name = 'remote-commons-logging-commons-logging-jar',
  out = 'commons-logging-commons-logging-jar-1.1.1.jar',
  url = 'mvn:commons-logging:commons-logging:jar:1.1.1',
  sha1 = '5043bfebc3db072ed80fbd362e7caf00e885d8ae',
)

prebuilt_jar(
  name = 'javax.annotation-jsr250-api-jar',
  binary_jar = ':remote-javax.annotation-jsr250-api-jar',
)

remote_file(
  name = 'remote-javax.annotation-jsr250-api-jar',
  out = 'javax.annotation-jsr250-api-jar-1.0.jar',
  url = 'mvn:javax.annotation:jsr250-api:jar:1.0',
  sha1 = '5025422767732a1ab45d93abfea846513d742dcf',
)

prebuilt_jar(
  name = 'javax.inject-javax.inject-jar',
  binary_jar = ':remote-javax.inject-javax.inject-jar',
)

remote_file(
  name = 'remote-javax.inject-javax.inject-jar',
  out = 'javax.inject-javax.inject-jar-1.jar',
  url = 'mvn:javax.inject:javax.inject:jar:1',
  sha1 = '6975da39a7040257bd51d21a231b76c915872d38',
)

prebuilt_jar(
  name = 'javax.validation-validation-api-sources',
  binary_jar = ':remote-javax.validation-validation-api-sources',
)

remote_file(
  name = 'remote-javax.validation-validation-api-sources',
  out = 'javax.validation-validation-api-sources-1.0.0.GA.jar',
  url = 'mvn:javax.validation:validation-api:sources:1.0.0.GA',
  sha1 = '7a561191db2203550fbfa40d534d4997624cd369',
)

prebuilt_jar(
  name = 'javax.validation-validation-api-jar',
  binary_jar = ':remote-javax.validation-validation-api-jar',
)

remote_file(
  name = 'remote-javax.validation-validation-api-jar',
  out = 'javax.validation-validation-api-jar-1.0.0.GA.jar',
  url = 'mvn:javax.validation:validation-api:jar:1.0.0.GA',
  sha1 = 'b6bd7f9d78f6fdaa3c37dae18a4bd298915f328e',
)

prebuilt_jar(
  name = 'junit-junit-jar',
  binary_jar = ':remote-junit-junit-jar',
)

remote_file(
  name = 'remote-junit-junit-jar',
  out = 'junit-junit-jar-4.10.jar',
  url = 'mvn:junit:junit:jar:4.10',
  sha1 = 'e4f1766ce7404a08f45d859fb9c226fc9e41a861',
)

prebuilt_jar(
  name = 'net.java.dev.javacc-javacc-jar',
  binary_jar = ':remote-net.java.dev.javacc-javacc-jar',
)

remote_file(
  name = 'remote-net.java.dev.javacc-javacc-jar',
  out = 'net.java.dev.javacc-javacc-jar-4.1.jar',
  url = 'mvn:net.java.dev.javacc:javacc:jar:4.1',
  sha1 = '915805643a5651cfe0e2db40c689c6dc211db97d',
)

prebuilt_jar(
  name = 'net.java.dev.jna-jna-jar',
  binary_jar = ':remote-net.java.dev.jna-jna-jar',
)

remote_file(
  name = 'remote-net.java.dev.jna-jna-jar',
  out = 'net.java.dev.jna-jna-jar-3.4.0.jar',
  url = 'mvn:net.java.dev.jna:jna:jar:3.4.0',
  sha1 = '803ff252fedbd395baffd43b37341dc4a150a554',
)

prebuilt_jar(
  name = 'net.java.dev.jna-platform-jar',
  binary_jar = ':remote-net.java.dev.jna-platform-jar',
)

remote_file(
  name = 'remote-net.java.dev.jna-platform-jar',
  out = 'net.java.dev.jna-platform-jar-3.4.0.jar',
  url = 'mvn:net.java.dev.jna:platform:jar:3.4.0',
  sha1 = 'e3f70017be8100d3d6923f50b3d2ee17714e9c13',
)

prebuilt_jar(
  name = 'net.sourceforge.cssparser-cssparser-jar',
  binary_jar = ':remote-net.sourceforge.cssparser-cssparser-jar',
)

remote_file(
  name = 'remote-net.sourceforge.cssparser-cssparser-jar',
  out = 'net.sourceforge.cssparser-cssparser-jar-0.9.5.jar',
  url = 'mvn:net.sourceforge.cssparser:cssparser:jar:0.9.5',
  sha1 = '7222f4a7e50fc57a88a546a228088524bdbbdaea',
)

prebuilt_jar(
  name = 'net.sourceforge.htmlunit-htmlunit-jar',
  binary_jar = ':remote-net.sourceforge.htmlunit-htmlunit-jar',
)

remote_file(
  name = 'remote-net.sourceforge.htmlunit-htmlunit-jar',
  out = 'net.sourceforge.htmlunit-htmlunit-jar-2.9.jar',
  url = 'mvn:net.sourceforge.htmlunit:htmlunit:jar:2.9',
  sha1 = 'b38b877dd9a10ae410ab2372eff7ff6c265962c7',
)

prebuilt_jar(
  name = 'net.sourceforge.htmlunit-htmlunit-core-js-jar',
  binary_jar = ':remote-net.sourceforge.htmlunit-htmlunit-core-js-jar',
)

remote_file(
  name = 'remote-net.sourceforge.htmlunit-htmlunit-core-js-jar',
  out = 'net.sourceforge.htmlunit-htmlunit-core-js-jar-2.9.jar',
  url = 'mvn:net.sourceforge.htmlunit:htmlunit-core-js:jar:2.9',
  sha1 = 'c90d338dddd18dd92ef0f933244b66db568b9f79',
)

prebuilt_jar(
  name = 'net.sourceforge.nekohtml-nekohtml-jar',
  binary_jar = ':remote-net.sourceforge.nekohtml-nekohtml-jar',
)

remote_file(
  name = 'remote-net.sourceforge.nekohtml-nekohtml-jar',
  out = 'net.sourceforge.nekohtml-nekohtml-jar-1.9.15.jar',
  url = 'mvn:net.sourceforge.nekohtml:nekohtml:jar:1.9.15',
  sha1 = 'a45cd7b7401d9c2264d4908182380452c03ebf8f',
)

prebuilt_jar(
  name = 'org.apache.commons-commons-exec-jar',
  binary_jar = ':remote-org.apache.commons-commons-exec-jar',
)

remote_file(
  name = 'remote-org.apache.commons-commons-exec-jar',
  out = 'org.apache.commons-commons-exec-jar-1.1.jar',
  url = 'mvn:org.apache.commons:commons-exec:jar:1.1',
  sha1 = '07dfdf16fade726000564386825ed6d911a44ba1',
)

prebuilt_jar(
  name = 'org.apache.httpcomponents-httpclient-jar',
  binary_jar = ':remote-org.apache.httpcomponents-httpclient-jar',
)

remote_file(
  name = 'remote-org.apache.httpcomponents-httpclient-jar',
  out = 'org.apache.httpcomponents-httpclient-jar-4.1.2.jar',
  url = 'mvn:org.apache.httpcomponents:httpclient:jar:4.1.2',
  sha1 = '9003011c1b6d28a7331f04251a25e7ccf63c98f8',
)

prebuilt_jar(
  name = 'org.apache.httpcomponents-httpcore-jar',
  binary_jar = ':remote-org.apache.httpcomponents-httpcore-jar',
)

remote_file(
  name = 'remote-org.apache.httpcomponents-httpcore-jar',
  out = 'org.apache.httpcomponents-httpcore-jar-4.1.2.jar',
  url = 'mvn:org.apache.httpcomponents:httpcore:jar:4.1.2',
  sha1 = '39e30fb2ddfcf32b9dd663039ca6e847b698aa6f',
)

prebuilt_jar(
  name = 'org.apache.httpcomponents-httpmime-jar',
  binary_jar = ':remote-org.apache.httpcomponents-httpmime-jar',
)

remote_file(
  name = 'remote-org.apache.httpcomponents-httpmime-jar',
  out = 'org.apache.httpcomponents-httpmime-jar-4.1.2.jar',
  url = 'mvn:org.apache.httpcomponents:httpmime:jar:4.1.2',
  sha1 = 'c78eaaea68d0f36f73b646f08cdb34f1a784239b',
)

prebuilt_jar(
  name = 'org.easymock-easymock-jar',
  binary_jar = ':remote-org.easymock-easymock-jar',
)

remote_file(
  name = 'remote-org.easymock-easymock-jar',
  out = 'org.easymock-easymock-jar-3.0.jar',
  url = 'mvn:org.easymock:easymock:jar:3.0',
  sha1 = 'f28a4c31c330f95c9acbf1108cea19952b5c496f',
)

prebuilt_jar(
  name = 'org.hamcrest-hamcrest-core-jar',
  binary_jar = ':remote-org.hamcrest-hamcrest-core-jar',
)

remote_file(
  name = 'remote-org.hamcrest-hamcrest-core-jar',
  out = 'org.hamcrest-hamcrest-core-jar-1.1.jar',
  url = 'mvn:org.hamcrest:hamcrest-core:jar:1.1',
  sha1 = '860340562250678d1a344907ac75754e259cdb14',
)

prebuilt_jar(
  name = 'org.jboss.netty-netty-jar',
  binary_jar = ':remote-org.jboss.netty-netty-jar',
)

remote_file(
  name = 'remote-org.jboss.netty-netty-jar',
  out = 'org.jboss.netty-netty-jar-3.2.7.Final.jar',
  url = 'mvn:org.jboss.netty:netty:jar:3.2.7.Final',
  sha1 = '1a1c5dde827576f3730bf6f3d7b389e770b90aaa',
)

prebuilt_jar(
  name = 'org.json-json-jar',
  binary_jar = ':remote-org.json-json-jar',
)

remote_file(
  name = 'remote-org.json-json-jar',
  out = 'org.json-json-jar-20160212.jar',
  url = 'mvn:org.json:json:jar:20160212',
  sha1 = 'a742e3f85161835b95877478c5dd5b405cefaab9',
)

prebuilt_jar(
  name = 'org.mockito-mockito-core-jar',
  binary_jar = ':remote-org.mockito-mockito-core-jar',
)

remote_file(
  name = 'remote-org.mockito-mockito-core-jar',
  out = 'org.mockito-mockito-core-jar-1.10.19.jar',
  url = 'mvn:org.mockito:mockito-core:jar:1.10.19',
  sha1 = 'e8546f5bef4e061d8dd73895b4e8f40e3fe6effe',
)

prebuilt_jar(
  name = 'org.objenesis-objenesis-jar',
  binary_jar = ':remote-org.objenesis-objenesis-jar',
)

remote_file(
  name = 'remote-org.objenesis-objenesis-jar',
  out = 'org.objenesis-objenesis-jar-2.1.jar',
  url = 'mvn:org.objenesis:objenesis:jar:2.1',
  sha1 = '87c0ea803b69252868d09308b4618f766f135a96',
)

prebuilt_jar(
  name = 'org.ow2.asm-asm-jar',
  binary_jar = ':remote-org.ow2.asm-asm-jar',
)

remote_file(
  name = 'remote-org.ow2.asm-asm-jar',
  out = 'org.ow2.asm-asm-jar-6.0.jar',
  url = 'mvn:org.ow2.asm:asm:jar:6.0',
  sha1 = 'bc6fa6b19424bb9592fe43bbc20178f92d403105',
)

prebuilt_jar(
  name = 'org.ow2.asm-asm-analysis-jar',
  binary_jar = ':remote-org.ow2.asm-asm-analysis-jar',
)

remote_file(
  name = 'remote-org.ow2.asm-asm-analysis-jar',
  out = 'org.ow2.asm-asm-analysis-jar-6.0.jar',
  url = 'mvn:org.ow2.asm:asm-analysis:jar:6.0',
  sha1 = 'dd1cc1381a970800268160203aae2d3784da779b',
)

prebuilt_jar(
  name = 'org.ow2.asm-asm-commons-jar',
  binary_jar = ':remote-org.ow2.asm-asm-commons-jar',
)

remote_file(
  name = 'remote-org.ow2.asm-asm-commons-jar',
  out = 'org.ow2.asm-asm-commons-jar-6.0.jar',
  url = 'mvn:org.ow2.asm:asm-commons:jar:6.0',
  sha1 = 'f256fd215d8dd5a4fa2ab3201bf653de266ed4ec',
)

prebuilt_jar(
  name = 'org.ow2.asm-asm-tree-jar',
  binary_jar = ':remote-org.ow2.asm-asm-tree-jar',
)

remote_file(
  name = 'remote-org.ow2.asm-asm-tree-jar',
  out = 'org.ow2.asm-asm-tree-jar-6.0.jar',
  url = 'mvn:org.ow2.asm:asm-tree:jar:6.0',
  sha1 = 'a624f1a6e4e428dcd680a01bab2d4c56b35b18f0',
)

prebuilt_jar(
  name = 'org.ow2.asm-asm-util-jar',
  binary_jar = ':remote-org.ow2.asm-asm-util-jar',
)

remote_file(
  name = 'remote-org.ow2.asm-asm-util-jar',
  out = 'org.ow2.asm-asm-util-jar-6.0.jar',
  url = 'mvn:org.ow2.asm:asm-util:jar:6.0',
  sha1 = '430b2fc839b5de1f3643b528853d5cf26096c1de',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-android-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-android-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-android-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-android-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-android-driver:jar:2.21.0',
  sha1 = 'c34e460052f45ef3e604409d9df90016413d1dc1',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-api-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-api-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-api-jar',
  out = 'org.seleniumhq.selenium-selenium-api-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-api:jar:2.21.0',
  sha1 = 'bf4932d31ce5f9e56d5f1fa5b14ce1b382ce9e3e',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-chrome-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-chrome-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-chrome-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-chrome-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-chrome-driver:jar:2.21.0',
  sha1 = 'b232fcef87b7548cc77e2d3214cc504fbac51d13',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-firefox-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-firefox-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-firefox-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-firefox-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-firefox-driver:jar:2.21.0',
  sha1 = 'c05a4a5b09c783a881a13432d78dc2cc0ebdd26d',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-htmlunit-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-htmlunit-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-htmlunit-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-htmlunit-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-htmlunit-driver:jar:2.21.0',
  sha1 = '69953aaf779b3574cdb5efed7a78f7469737ea0b',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-ie-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-ie-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-ie-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-ie-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-ie-driver:jar:2.21.0',
  sha1 = 'a47db3996c729bab12407b32a9966e530873925a',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-iphone-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-iphone-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-iphone-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-iphone-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-iphone-driver:jar:2.21.0',
  sha1 = '2b87b30782809c06fc97d7fc583768c21494b72d',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-java-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-java-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-java-jar',
  out = 'org.seleniumhq.selenium-selenium-java-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-java:jar:2.21.0',
  sha1 = '632a3316c3cf2261ff25eac26cdc72791dc45fd7',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-remote-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-remote-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-remote-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-remote-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-remote-driver:jar:2.21.0',
  sha1 = '87a39f0d02cae8a05468504ad1b0258ae9dc3eda',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-safari-driver-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-safari-driver-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-safari-driver-jar',
  out = 'org.seleniumhq.selenium-selenium-safari-driver-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-safari-driver:jar:2.21.0',
  sha1 = '47ba1289d04428313998ca027160ea101159da11',
)

prebuilt_jar(
  name = 'org.seleniumhq.selenium-selenium-support-jar',
  binary_jar = ':remote-org.seleniumhq.selenium-selenium-support-jar',
)

remote_file(
  name = 'remote-org.seleniumhq.selenium-selenium-support-jar',
  out = 'org.seleniumhq.selenium-selenium-support-jar-2.21.0.jar',
  url = 'mvn:org.seleniumhq.selenium:selenium-support:jar:2.21.0',
  sha1 = 'c473cc8ca648edf8f3af0984a589c14d0745c9ec',
)

prebuilt_jar(
  name = 'org.w3c.css-sac-jar',
  binary_jar = ':remote-org.w3c.css-sac-jar',
)

remote_file(
  name = 'remote-org.w3c.css-sac-jar',
  out = 'org.w3c.css-sac-jar-1.3.jar',
  url = 'mvn:org.w3c.css:sac:jar:1.3',
  sha1 = 'cdb2dcb4e22b83d6b32b93095f644c3462739e82',
)

prebuilt_jar(
  name = 'org.webbitserver-webbit-jar',
  binary_jar = ':remote-org.webbitserver-webbit-jar',
)

remote_file(
  name = 'remote-org.webbitserver-webbit-jar',
  out = 'org.webbitserver-webbit-jar-0.4.6.jar',
  url = 'mvn:org.webbitserver:webbit:jar:0.4.6',
  sha1 = 'e683ab46f7ebecdabc0acffb87821a58a01f0344',
)

prebuilt_jar(
  name = 'xalan-serializer-jar',
  binary_jar = ':remote-xalan-serializer-jar',
)

remote_file(
  name = 'remote-xalan-serializer-jar',
  out = 'xalan-serializer-jar-2.7.1.jar',
  url = 'mvn:xalan:serializer:jar:2.7.1',
  sha1 = '4b4b18df434451249bb65a63f2fb69e215a6a020',
)

prebuilt_jar(
  name = 'xalan-xalan-jar',
  binary_jar = ':remote-xalan-xalan-jar',
)

remote_file(
  name = 'remote-xalan-xalan-jar',
  out = 'xalan-xalan-jar-2.7.1.jar',
  url = 'mvn:xalan:xalan:jar:2.7.1',
  sha1 = '75f1d83ce27bab5f29fff034fc74aa9f7266f22a',
)

prebuilt_jar(
  name = 'xerces-xercesImpl-jar',
  binary_jar = ':remote-xerces-xercesImpl-jar',
)

remote_file(
  name = 'remote-xerces-xercesImpl-jar',
  out = 'xerces-xercesImpl-jar-2.9.1.jar',
  url = 'mvn:xerces:xercesImpl:jar:2.9.1',
  sha1 = '7bc7e49ddfe4fb5f193ed37ecc96c12292c8ceb6',
)

prebuilt_jar(
  name = 'xml-apis-xml-apis-jar',
  binary_jar = ':remote-xml-apis-xml-apis-jar',
)

remote_file(
  name = 'remote-xml-apis-xml-apis-jar',
  out = 'xml-apis-xml-apis-jar-1.3.04.jar',
  url = 'mvn:xml-apis:xml-apis:jar:1.3.04',
  sha1 = '90b215f48fe42776c8c7f6e3509ec54e84fd65ef',
)

