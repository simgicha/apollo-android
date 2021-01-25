// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.inline_fragment_for_non_optional_field.adapter

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.inline_fragment_for_non_optional_field.TestQuery
import kotlin.Array
import kotlin.Double
import kotlin.String
import kotlin.Suppress

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
object TestQuery_ResponseAdapter : ResponseAdapter<TestQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField(
      type = ResponseField.Type.NotNull(ResponseField.Type.Named.Object("Character")),
      responseName = "nonOptionalHero",
      fieldName = "nonOptionalHero",
      arguments = mapOf<String, Any?>(
        "episode" to "EMPIRE"),
      conditions = emptyList(),
    )
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): TestQuery.Data {
    return reader.run {
      var nonOptionalHero: TestQuery.Data.NonOptionalHero? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> nonOptionalHero = readObject<TestQuery.Data.NonOptionalHero>(RESPONSE_FIELDS[0]) { reader ->
            NonOptionalHero.fromResponse(reader)
          }
          else -> break
        }
      }
      TestQuery.Data(
        nonOptionalHero = nonOptionalHero!!
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: TestQuery.Data) {
    writer.writeObject(RESPONSE_FIELDS[0]) { writer ->
      NonOptionalHero.toResponse(writer, value.nonOptionalHero)
    }
  }

  object NonOptionalHero : ResponseAdapter<TestQuery.Data.NonOptionalHero> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
        responseName = "__typename",
        fieldName = "__typename",
        arguments = emptyMap(),
        conditions = emptyList(),
      ),
      ResponseField(
        type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
        responseName = "name",
        fieldName = "name",
        arguments = emptyMap(),
        conditions = emptyList(),
      )
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        TestQuery.Data.NonOptionalHero {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> HumanNonOptionalHero.fromResponse(reader, typename)
        else -> OtherNonOptionalHero.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: TestQuery.Data.NonOptionalHero) {
      when(value) {
        is TestQuery.Data.NonOptionalHero.HumanNonOptionalHero -> HumanNonOptionalHero.toResponse(writer, value)
        is TestQuery.Data.NonOptionalHero.OtherNonOptionalHero -> OtherNonOptionalHero.toResponse(writer, value)
      }
    }

    object HumanNonOptionalHero :
        ResponseAdapter<TestQuery.Data.NonOptionalHero.HumanNonOptionalHero> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "__typename",
          fieldName = "__typename",
          arguments = emptyMap(),
          conditions = emptyList(),
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
        ),
        ResponseField(
          type = ResponseField.Type.Named.Other("Float"),
          responseName = "height",
          fieldName = "height",
          arguments = emptyMap(),
          conditions = emptyList(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.NonOptionalHero.HumanNonOptionalHero {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          var height: Double? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              2 -> height = readDouble(RESPONSE_FIELDS[2])
              else -> break
            }
          }
          TestQuery.Data.NonOptionalHero.HumanNonOptionalHero(
            __typename = __typename!!,
            name = name!!,
            height = height
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: TestQuery.Data.NonOptionalHero.HumanNonOptionalHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
        writer.writeDouble(RESPONSE_FIELDS[2], value.height)
      }
    }

    object OtherNonOptionalHero :
        ResponseAdapter<TestQuery.Data.NonOptionalHero.OtherNonOptionalHero> {
      private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "__typename",
          fieldName = "__typename",
          arguments = emptyMap(),
          conditions = emptyList(),
        ),
        ResponseField(
          type = ResponseField.Type.NotNull(ResponseField.Type.Named.Other("String")),
          responseName = "name",
          fieldName = "name",
          arguments = emptyMap(),
          conditions = emptyList(),
        )
      )

      override fun fromResponse(reader: ResponseReader, __typename: String?):
          TestQuery.Data.NonOptionalHero.OtherNonOptionalHero {
        return reader.run {
          var __typename: String? = __typename
          var name: String? = null
          while(true) {
            when (selectField(RESPONSE_FIELDS)) {
              0 -> __typename = readString(RESPONSE_FIELDS[0])
              1 -> name = readString(RESPONSE_FIELDS[1])
              else -> break
            }
          }
          TestQuery.Data.NonOptionalHero.OtherNonOptionalHero(
            __typename = __typename!!,
            name = name!!
          )
        }
      }

      override fun toResponse(writer: ResponseWriter,
          value: TestQuery.Data.NonOptionalHero.OtherNonOptionalHero) {
        writer.writeString(RESPONSE_FIELDS[0], value.__typename)
        writer.writeString(RESPONSE_FIELDS[1], value.name)
      }
    }
  }
}
