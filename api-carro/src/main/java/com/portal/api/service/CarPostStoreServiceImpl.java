package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService  {

    private CarPostStoreClient carPostStoreClient;


    @Override
    public List<CarPostDTO> getCarForSale() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPost, String id) {
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSalle(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);

    }
}
