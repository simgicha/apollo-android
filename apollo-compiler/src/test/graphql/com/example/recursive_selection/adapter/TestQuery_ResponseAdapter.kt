// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.recursive_selection.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.recursive_selection.TestQuery
import kotlin.Array
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.Named.Object("Tree"),
      responseName = "tree",
      fieldName = "tree",
      arguments = emptyMap(),
      conditions = emptyList(),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var tree: TestQuery.Data.Tree? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> tree = readObject<TestQuery.Data.Tree>(RESPONSE_FIELDS[0]) { reader ->
            Tree.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        tree = tree
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    if(value.tree == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
        Tree.toResponse(writer, value.tree)
      }
    }
  }

  object Tree : ResponseAdapter<TestQuery.Data.Tree> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
        responseName = "name",
        fieldName = "name",
        arguments = emptyMap(),
        conditions = emptyList(),
      ),
      ResponseField(
        type =
            ResponseField.Type.NotNull(ResponseField.Type.List(ResponseField.Type.NotNull(ResponseField.Type.Named.Object("Tree")))),
        responseName = "children",
        fieldName = "children",
        arguments = emptyMap(),
        conditions = emptyList(),
      ),
      ResponseField(
        type = ResponseField.Type.Named.Object("Tree"),
        responseName = "parent",
        fieldName = "parent",
        arguments = emptyMap(),
        conditions = emptyList(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data.Tree {
      return reader.run {
        var name: String? = null
        var children: List<TestQuery.Data.Tree.Child>? = null
        var parent: TestQuery.Data.Tree.Parent? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> name = readString(RESPONSE_FIELDS[0])
            1 -> children = readList<TestQuery.Data.Tree.Child>(RESPONSE_FIELDS[1]) { reader ->
              reader.readObject<TestQuery.Data.Tree.Child> { reader ->
                Child.fromResponse(reader)
              }
            }?.map { it!! }
            2 -> parent = readObject<TestQuery.Data.Tree.Parent>(RESPONSE_FIELDS[2]) { reader ->
              Parent.fromResponse(reader)
            }
            else -> break
          }
        }
        TestQuery.Data.Tree(
          name = name!!,
          children = children!!,
          parent = parent
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Tree) {
      writer.writeString(RESPONSE_FIELDS[0], value.name)
      writer.writeList(RESPONSE_FIELDS[1], value.children) { value, listItemWriter ->
        listItemWriter.writeObject { writer ->
          Child.toResponse(writer, value)
        }
      }
      if(value.parent == null) {
        writer.writeObject(RESPONSE_FIELDS[2], null)
      } else {
        writer.writeObject(RESPONSE_FIELDS[2]) { writer ->
          Parent.toResponse(writer, value.parent)
        }
      }
    }

    object Child : ResponseAdapter<TestQuery.Data.Tree.Child> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Tree.Child {
        return reader.run {
          var name: String? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> name = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQuery.Data.Tree.Child(
            name = name!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Tree.Child) {
        writer.writeString(RESPONSE_FIELDS[0], value.name)
      }
    }

    object Parent : ResponseAdapter<TestQuery.Data.Tree.Parent> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.Tree.Parent {
        return reader.run {
          var name: String? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> name = readString(RESPONSE_FIELDS[0])
              else -> break
            }
          }
          TestQuery.Data.Tree.Parent(
            name = name!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.Tree.Parent) {
        writer.writeString(RESPONSE_FIELDS[0], value.name)
      }
    }
  }
}
