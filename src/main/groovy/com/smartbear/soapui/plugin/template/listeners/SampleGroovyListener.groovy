package com.smartbear.soapui.plugin.template.listeners

import com.eviware.soapui.SoapUI
import com.eviware.soapui.model.support.TestRunListenerAdapter
import com.eviware.soapui.model.testsuite.TestCaseRunContext
import com.eviware.soapui.model.testsuite.TestCaseRunner
import com.eviware.soapui.model.testsuite.TestRunListener

/**
 * Created by ole on 16/01/14.
 */
class SampleGroovyListener extends TestRunListenerAdapter
{
    @Override
    void beforeRun(TestCaseRunner testRunner, TestCaseRunContext runContext) {
        SoapUI.log "Test $testRunner.testCase.name starting..."
    }

    @Override
    void afterRun(TestCaseRunner testRunner, TestCaseRunContext runContext) {
        SoapUI.log "Test $testRunner.testCase.name stopping..."
    }
}
