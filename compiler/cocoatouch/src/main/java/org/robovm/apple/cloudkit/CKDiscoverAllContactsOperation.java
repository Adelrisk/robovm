/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.cloudkit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.contacts.*;
import org.robovm.apple.fileprovider.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 * @deprecated Deprecated in iOS 10.0.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CloudKit") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CKDiscoverAllContactsOperation/*</name>*/ 
    extends /*<extends>*/CKOperation/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CKDiscoverAllContactsOperationPtr extends Ptr<CKDiscoverAllContactsOperation, CKDiscoverAllContactsOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CKDiscoverAllContactsOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CKDiscoverAllContactsOperation() {}
    protected CKDiscoverAllContactsOperation(Handle h, long handle) { super(h, handle); }
    protected CKDiscoverAllContactsOperation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "discoverAllContactsCompletionBlock")
    public native @Block VoidBlock2<NSArray<CKDiscoveredUserInfo>, NSError> getDiscoverAllContactsCompletionBlock();
    @Property(selector = "setDiscoverAllContactsCompletionBlock:")
    public native void setDiscoverAllContactsCompletionBlock(@Block VoidBlock2<NSArray<CKDiscoveredUserInfo>, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
