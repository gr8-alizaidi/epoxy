package com.alizaidi.epoxy

data class SimpleModel(val type: String, val content: String)

fun getSimpleData() = mutableListOf(
    SimpleModel("Me", "Category1"),
    SimpleModel("Other", "Lorem-Ipsum"),
    SimpleModel("Other", "Lorem-dasd"),
    SimpleModel("Other", "Lorem-dmbsajcb"),
    SimpleModel("Me", "Category2"),
    SimpleModel("Other", "Lorem-fdsjdf"),
    SimpleModel("Other", "Lorem-dmfd"),
    SimpleModel("Other", "Lorem-mdabjds"),
    SimpleModel("Me", "Category3"),
    SimpleModel("Other", "Lorem-dfbjdf"),
    SimpleModel("Other", "Lorem-dfbjd"),
    SimpleModel("Other", "Lorem-kfdbjdf"),
    SimpleModel("Me", "Category4"),
    SimpleModel("Other", "Lorem-fmbsdf"),
    SimpleModel("Other", "Lorem-fbfjd"),
    SimpleModel("Other", "End of list")
)