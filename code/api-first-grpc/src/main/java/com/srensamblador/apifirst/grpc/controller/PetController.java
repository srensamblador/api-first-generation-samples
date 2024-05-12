package com.srensamblador.apifirst.grpc.controller;

import com.srensamblador.apifirst.grpc.petstore.PetProto;
import com.srensamblador.apifirst.grpc.petstore.PetServiceProto;
import com.srensamblador.apifirst.grpc.petstore.PetStoreServiceGrpc;
import com.srensamblador.apifirst.grpc.petstore.request.GetPetRequestProto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PetController extends PetStoreServiceGrpc.PetStoreServiceImplBase {

    @Override
    public void petById(GetPetRequestProto.GetPetRequest request, StreamObserver<PetProto.Pet> responseObserver) {
        super.petById(request, responseObserver);
    }
}
