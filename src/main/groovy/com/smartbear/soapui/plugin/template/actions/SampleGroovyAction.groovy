package com.smartbear.soapui.plugin.template.actions

import com.eviware.soapui.impl.wsdl.WsdlProject
import com.eviware.soapui.support.UISupport
import com.eviware.soapui.support.action.support.AbstractSoapUIAction

/**
 * Created by ole on 16/01/14.
 */
class SampleGroovyAction extends AbstractSoapUIAction<WsdlProject>{
    public SampleGroovyAction()
    {
        super( "Sample Groovy Action", "A sample groovy action at the project level");
    }

    @Override
    void perform(WsdlProject wsdlProject, Object o) {
        UISupport.showInfoMessage( "Hello from [$wsdlProject.name]!")
    }
}
