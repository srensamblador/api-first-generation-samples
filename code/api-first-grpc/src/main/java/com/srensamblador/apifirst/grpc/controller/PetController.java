package com.srensamblador.apifirst.grpc.controller;

import com.google.protobuf.Empty;
import com.srensamblador.apifirst.grpc.petstore.v1.PetProto;
import com.srensamblador.apifirst.grpc.petstore.v1.PetStoreServiceGrpc;
import com.srensamblador.apifirst.grpc.petstore.v1.request.CreatePetRequestProto;
import com.srensamblador.apifirst.grpc.petstore.v1.request.DeletePetRequestProto;
import com.srensamblador.apifirst.grpc.petstore.v1.request.GetPetRequestProto;
import com.srensamblador.apifirst.grpc.petstore.v1.request.UpdatePetRequestProto;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PetController extends PetStoreServiceGrpc.PetStoreServiceImplBase {
    @Override
    public void get(GetPetRequestProto.GetPetRequest request, StreamObserver<PetProto.Pet> responseObserver) {
        super.get(request, responseObserver);
    }

    @Override
    public void list(Empty request, StreamObserver<PetProto.Pet> responseObserver) {
        super.list(request, responseObserver);
    }

    @Override
    public void create(CreatePetRequestProto.CreatePetRequest request, StreamObserver<PetProto.Pet> responseObserver) {
        super.create(request, responseObserver);
    }

    @Override
    public void delete(DeletePetRequestProto.DeletePetRequest request, StreamObserver<Empty> responseObserver) {
        super.delete(request, responseObserver);
    }

    @Override
    public void update(UpdatePetRequestProto.UpdatePetRequest request, StreamObserver<Empty> responseObserver) {
        super.update(request, responseObserver);
    }
}
