/*
 * Automatically generated by jrpcgen 1.0.7 on 2/21/09 1:22 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package org.dcache.chimera.nfs.v4.xdr;

import java.io.IOException;
import org.dcache.xdr.OncRpcException;
import org.dcache.xdr.RpcCall;
import org.dcache.xdr.RpcDispatchable;
import org.dcache.xdr.XdrVoid;

/**
 */
public abstract class nfs4_prot_NFS4_PROGRAM_ServerStub implements RpcDispatchable {


    public void dispatchOncRpcCall(RpcCall call)
           throws OncRpcException, IOException {

        int version = call.getProgramVersion();
        int procedure = call.getProcedure();

        if ( version == 4 ) {
            switch ( procedure ) {
            case 0: {
                call.retrieveCall(XdrVoid.XDR_VOID);
                NFSPROC4_NULL_4(call);
                call.reply(XdrVoid.XDR_VOID);
                break;
            }
            case 1: {
                COMPOUND4args args$ = new COMPOUND4args();
                call.retrieveCall(args$);
                COMPOUND4res result$ = NFSPROC4_COMPOUND_4(call, args$);
                call.reply(result$);
                break;
            }
            default:
                call.failProcedureUnavailable();
            }
        } else {
            call.failProgramUnavailable();
        }
    }

    public abstract void NFSPROC4_NULL_4(RpcCall call$);

    public abstract COMPOUND4res NFSPROC4_COMPOUND_4(RpcCall call$, COMPOUND4args arg1);

}
// End of nfs4_prot_NFS4_PROGRAM_ServerStub.java