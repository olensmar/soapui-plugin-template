package com.smartbear.soapui.plugin.template.listeners;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.support.TestRunListenerAdapter;
import com.eviware.soapui.model.testsuite.TestCaseRunContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;

/**
 * Created by ole on 16/01/14.
 */
public class SampleJavaListener extends TestRunListenerAdapter {

    @Override
    public void beforeRun(TestCaseRunner testRunner, TestCaseRunContext runContext) {
        SoapUI.log( "Test " + testRunner.getTestCase().getName() + " starting...");
    }

    @Override
    public void afterRun(TestCaseRunner testRunner, TestCaseRunContext runContext) {
        SoapUI.log( "Test " + testRunner.getTestCase().getName() + " stopping...");
    }
}
