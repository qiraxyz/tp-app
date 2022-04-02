if { SketchUtil.isConnected 
       setChangeEditText("Your status now is : Online")
    }
else 
{ if { !SketchUtil.isConnected 
        setChangeEditText("Your Status Now is : Offline")
  
      }
 end();
