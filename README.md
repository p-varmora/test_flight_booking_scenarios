# Flight_Booking_Scenario :

    /*
    Description : A person wants to check for the round-trip flights from San Francisco(SFO) to Orlando,FL(MCO) for 1 passenger
                  on booking.com portal for the 16th April and 22nd April and make sure layover city, Date, filling dates and time
                  in depart and return flight. Automate the same using
                  (https://www.booking.com/) portal.
Automation Steps :
1.Launch the browser with “https://www.booking.com/ ”
2.Select Flights form homepage
3.check round-trip radio button
4.Select  Flight Departure Airport : SFO
5.Select Flight Arrival Airport : Orlando,FL (MCO)
6.Click Flight Date Range :'04/16/2020 – 04/22/2020'
7.Select 1 Adult
8.Select Cabin Class: Economy
9.Click find your flight button (will navigate to flight details page)
10.Validate all Departure and Return Information (layover city, time-duration, etc )
 */
 
 
 Output Logs: 
 
 /Library/Java/JavaVirtualMachines/jdk-11.0.1.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:51094,suspend=y,server=n -ea -Didea.test.cyclic.buffer.size=1048576 -javaagent:/Users/parth/Library/Caches/IntelliJIdea2018.3/captureAgent/debugger-agent.jar -Dfile.encoding=UTF-8 -classpath "/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/testng/lib/testng-plugin.jar:/Users/parth/IdeaProjects/Kayak_Flight_Booking_Scenario/FlightBookingScenaios/target/test-classes:/Users/parth/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/parth/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar:/Users/parth/.m2/repository/org/testng/testng/6.14.3/testng-6.14.3.jar:/Users/parth/.m2/repository/com/beust/jcommander/1.72/jcommander-1.72.jar:/Users/parth/.m2/repository/org/apache-extras/beanshell/bsh/2.0b6/bsh-2.0b6.jar:/Users/parth/.m2/repository/org/apache/httpcomponents/httpclient/4.5.8/httpclient-4.5.8.jar:/Users/parth/.m2/repository/org/apache/httpcomponents/httpcore/4.4.11/httpcore-4.4.11.jar:/Users/parth/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/Users/parth/.m2/repository/commons-codec/commons-codec/1.11/commons-codec-1.11.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-java/3.141.59/selenium-java-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-api/3.141.59/selenium-api-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-chrome-driver/3.141.59/selenium-chrome-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-edge-driver/3.141.59/selenium-edge-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-firefox-driver/3.141.59/selenium-firefox-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-ie-driver/3.141.59/selenium-ie-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-opera-driver/3.141.59/selenium-opera-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-remote-driver/3.141.59/selenium-remote-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-safari-driver/3.141.59/selenium-safari-driver-3.141.59.jar:/Users/parth/.m2/repository/org/seleniumhq/selenium/selenium-support/3.141.59/selenium-support-3.141.59.jar:/Users/parth/.m2/repository/net/bytebuddy/byte-buddy/1.8.15/byte-buddy-1.8.15.jar:/Users/parth/.m2/repository/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar:/Users/parth/.m2/repository/com/google/guava/guava/25.0-jre/guava-25.0-jre.jar:/Users/parth/.m2/repository/com/google/code/findbugs/jsr305/1.3.9/jsr305-1.3.9.jar:/Users/parth/.m2/repository/org/checkerframework/checker-compat-qual/2.0.0/checker-compat-qual-2.0.0.jar:/Users/parth/.m2/repository/com/google/errorprone/error_prone_annotations/2.1.3/error_prone_annotations-2.1.3.jar:/Users/parth/.m2/repository/com/google/j2objc/j2objc-annotations/1.1/j2objc-annotations-1.1.jar:/Users/parth/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.14/animal-sniffer-annotations-1.14.jar:/Users/parth/.m2/repository/com/squareup/okhttp3/okhttp/3.11.0/okhttp-3.11.0.jar:/Users/parth/.m2/repository/com/squareup/okio/okio/1.14.0/okio-1.14.0.jar:/Applications/IntelliJ IDEA.app/Contents/plugins/testng/lib/jcommander.jar" org.testng.RemoteTestNGStarter -usedefaultlisteners false -socket51093 @w@/private/var/folders/8h/_275_7lx0_bfv3h6rxfvxt6h0000gn/T/idea_working_dirs_testng.tmp -temp /private/var/folders/8h/_275_7lx0_bfv3h6rxfvxt6h0000gn/T/idea_testng.tmp
Connected to the target VM, address: '127.0.0.1:51094', transport: 'socket'
2020-03-19T23:45:51.438172 : Start chrome browser
1584686751905	mozrunner::runner	INFO	Running command: "/Applications/Firefox.app/Contents/MacOS/firefox-bin" "-marionette" "-foreground" "-no-remote" "-profile" "/var/folders/8h/_275_7lx0_bfv3h6rxfvxt6h0000gn/T/rust_mozprofile.bIVPeJtSSjJ1"
1584686752282	addons.webextension.doh-rollout@mozilla.org	WARN	Loading extension 'doh-rollout@mozilla.org': Reading manifest: Invalid extension permission: networkStatus
1584686752506	addons.webextension.screenshots@mozilla.org	WARN	Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: mozillaAddons
1584686752506	addons.webextension.screenshots@mozilla.org	WARN	Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: telemetry
1584686752506	addons.webextension.screenshots@mozilla.org	WARN	Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: resource://pdf.js/
1584686752506	addons.webextension.screenshots@mozilla.org	WARN	Loading extension 'screenshots@mozilla.org': Reading manifest: Invalid extension permission: about:reader*
1584686753951	Marionette	INFO	Listening on port 51162
1584686753965	Marionette	WARN	TLS certificate errors will be ignored for this session
Mar 19, 2020 11:45:54 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
2020-03-19T23:45:54.048453 : Set the page load timeout for any page load
2020-03-19T23:45:54.061834 : Navigate to url : https://www.booking.com/
2020-03-19T23:45:56.913455 : Maximize window
2020-03-19T23:45:57.405587 : Set implicit wait for all the activities on the browser
2020-03-19T23:45:57.411379 : Set selenium script timeout
2020-03-19T23:45:57.422217 : Execute any asynchronous script
2020-03-19T23:45:57.996735 : Select Flights
2020-03-19T23:45:58.027338 : FindElement *** By.xpath: //span[text()='Flights'] *** Found
JavaScript error: , line 0: uncaught exception: null
2020-03-19T23:45:59.864014 : Select Round-Trip
2020-03-19T23:46:01.661431 : FindElement *** By.xpath: //input[@type='radio'][@name='tripType'] *** Found
2020-03-19T23:46:03.410699 : Select  Flight Departure Airport : SFO 
2020-03-19T23:46:03.427920 : FindElement *** By.xpath: //input[@type='text'][@id='flight-departure-airport0'] *** Found
2020-03-19T23:46:05.817038 : FindElement *** By.xpath: //div[contains(text(),'San Francisco, CA (SFO)')] *** Found
JavaScript error: , line 0: uncaught exception: [object Object]
2020-03-19T23:46:06.248506 : Select Flight Arrival Airport : Orlando,FL (MCO)
2020-03-19T23:46:06.304353 : FindElement *** By.xpath: //input[@type='text'][@id='flight-arrival-airport0'] *** Found
2020-03-19T23:46:06.691231 : FindElement *** By.xpath: //div[contains(text(),'Orlando, FL (MCO)')] *** Found
2020-03-19T23:46:08.213578 : Click Flight Date Range :'04/16/2020 – 04/22/2020'
1584686768754	Marionette	WARN	TimedPromise timed out after 500 ms: stacktrace:
TimedPromise/<@chrome://marionette/content/sync.js:244:13
TimedPromise@chrome://marionette/content/sync.js:229:10
interaction.flushEventLoop@chrome://marionette/content/interaction.js:416:10
webdriverClickElement@chrome://marionette/content/interaction.js:182:31
2020-03-19T23:46:08.974344 : FindElement *** By.xpath: //input[@class='sc-hgHYgh hjXxSf'] *** Found
2020-03-19T23:46:10.281025 : Select 1 Adult 
2020-03-19T23:46:10.291895 : FindElement *** By.xpath: //text()[.='1 Adult']/ancestor::button[1] *** Found
1584686770812	Marionette	WARN	TimedPromise timed out after 500 ms: stacktrace:
TimedPromise/<@chrome://marionette/content/sync.js:244:13
TimedPromise@chrome://marionette/content/sync.js:229:10
interaction.flushEventLoop@chrome://marionette/content/interaction.js:416:10
webdriverClickElement@chrome://marionette/content/interaction.js:182:31
2020-03-19T23:46:12.230154 : FindElement *** By.xpath: //button[text()='Done'] *** Found
1584686772750	Marionette	WARN	TimedPromise timed out after 500 ms: stacktrace:
TimedPromise/<@chrome://marionette/content/sync.js:244:13
TimedPromise@chrome://marionette/content/sync.js:229:10
interaction.flushEventLoop@chrome://marionette/content/interaction.js:416:10
webdriverClickElement@chrome://marionette/content/interaction.js:182:31
2020-03-19T23:46:14.160499 : Select  Cabin Class : Economy
2020-03-19T23:46:14.169336 : FindElement *** By.xpath: //select[@name='cabinClass'] *** Found
1584686774685	Marionette	WARN	TimedPromise timed out after 500 ms: stacktrace:
TimedPromise/<@chrome://marionette/content/sync.js:244:13
TimedPromise@chrome://marionette/content/sync.js:229:10
interaction.flushEventLoop@chrome://marionette/content/interaction.js:416:10
webdriverClickElement@chrome://marionette/content/interaction.js:182:31
2020-03-19T23:46:16.091701 : Click find your flight button 
2020-03-19T23:46:16.099409 : FindElement *** By.xpath: //button[text()='Find your flight'] *** Found
1584686776621	Marionette	WARN	TimedPromise timed out after 500 ms: stacktrace:
TimedPromise/<@chrome://marionette/content/sync.js:244:13
TimedPromise@chrome://marionette/content/sync.js:229:10
interaction.flushEventLoop@chrome://marionette/content/interaction.js:416:10
webdriverClickElement@chrome://marionette/content/interaction.js:182:31
2020-03-19T23:46:33.045581 : validate departure information text 
2020-03-19T23:46:33.045664 : validate departure date :Thursday, April 16 
2020-03-19T23:46:33.045707 : validate departure city : San francisco 
2020-03-19T23:46:33.045744 : validate arrival city : Orlando, FL
2020-03-19T23:46:33.045778 : validate departure layover in city : Las Vegas 
2020-03-19T23:46:33.045813 : validate departure layover duration : 1 Stop - 1h 11m 
2020-03-19T23:46:33.045848 : validate Return Information text 
2020-03-19T23:46:33.045883 : validate return date : Wednesday, April 22
2020-03-19T23:46:33.045919 : validate departure city : Orlando,FL
2020-03-19T23:46:33.045957 : validate arrival city : San Francisco
2020-03-19T23:46:33.045992 : validate return layover in city : Newark,NJ 
2020-03-19T23:46:33.046025 : validate return layover duration : 1 Stop - 1h 4m 
2020-03-19T23:46:33.047024 : Closing chrome
1584686793050	Marionette	INFO	Stopped listening on port 51162
Disconnected from the target VM, address: '127.0.0.1:51094', transport: 'socket'
2020-03-19T23:46:36.728115 : DONE!

===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================


Process finished with exit code 0


