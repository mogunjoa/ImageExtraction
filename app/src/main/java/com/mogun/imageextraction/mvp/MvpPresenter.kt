package com.mogun.imageextraction.mvp

import com.mogun.imageextraction.mvp.model.ImageCountModel
import com.mogun.imageextraction.mvp.repository.ImageRepository

class MvpPresenter (
    private val model: ImageCountModel,
    private val imageRepository: ImageRepository
) : MvpContractor.Presenter, ImageRepository.CallBack {

    private var view: MvpContractor.View? = null

    override fun attachView(view: MvpContractor.View) {
        this.view = view
    }

    override fun detachView() {
        view = null
    }

    override fun loadRandomImage() {
        imageRepository.getRandomImage(this)
    }

    override fun loadImage(url: String, color: String) {
        model.increase()
        view?.showImage(url, color)
        view?.showImageCountText(model.count)
    }
}