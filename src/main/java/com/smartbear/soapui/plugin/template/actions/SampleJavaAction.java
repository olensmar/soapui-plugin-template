package com.smartbear.soapui.plugin.template.actions;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.action.support.AbstractSoapUIAction;

/**
 * Created by ole on 16/01/14.
 */
public class SampleJavaAction extends AbstractSoapUIAction<WsdlProject> {

    public SampleJavaAction()
    {
        super( "Sample Java Action", "A sample java action at the project level" );
    }

    @Override
    public void perform(WsdlProject wsdlProject, Object o) {
        UISupport.showInfoMessage( "Hello from [" + wsdlProject.getName() + "]!");
    }
}
