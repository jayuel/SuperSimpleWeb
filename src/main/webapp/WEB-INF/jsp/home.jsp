<%@ include file="/WEB-INF/jsp/taglibs.jsp" %>

<s:layout-render name="/WEB-INF/jsp/layout.jsp" title="Welcome">
  <s:layout-component name="body">
    <p>${actionBean.service},</p> 
    <p>Congratulations you've set up a Stripes-Guice project!</p>
    <p>
      You are running Java version ${actionBean.javaVersion}
      on the ${actionBean.osName} operating system.
    </p>
  </s:layout-component>
</s:layout-render>
