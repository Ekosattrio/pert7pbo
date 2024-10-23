/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pert7;

/**
 *
 * @author Advan
 */

public class Pesanan {
    private Produk produk;
    private int jumlahBeli;

    public Pesanan(Produk produk, int jumlahBeli) {
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
    }

    public int hitungJumlahBayar() {
        return produk.getHarga() * jumlahBeli;
    }

    // Getter methods
    public Produk getProduk() {
        return produk;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }
}

