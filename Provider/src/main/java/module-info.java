import interesting.MyServiceInterface;

open module Provider {
  exports interesting /*to Consumer*/;
//  opens interesting to Consumer, OtherModule;
  provides MyServiceInterface with myserviceif.ServiceImpl;
}
