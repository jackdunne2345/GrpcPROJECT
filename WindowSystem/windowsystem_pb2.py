# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: windowsystem.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12windowsystem.proto\"\x1c\n\rWindowRequest\x12\x0b\n\x03val\x18\x01 \x01(\x05\"\x1a\n\x0bWindowReply\x12\x0b\n\x03val\x18\x01 \x01(\x05\x32<\n\x0fWindowOcService\x12)\n\twindowsOC\x12\x0e.WindowRequest\x1a\x0c.WindowReplyb\x06proto3')



_WINDOWREQUEST = DESCRIPTOR.message_types_by_name['WindowRequest']
_WINDOWREPLY = DESCRIPTOR.message_types_by_name['WindowReply']
WindowRequest = _reflection.GeneratedProtocolMessageType('WindowRequest', (_message.Message,), {
  'DESCRIPTOR' : _WINDOWREQUEST,
  '__module__' : 'windowsystem_pb2'
  # @@protoc_insertion_point(class_scope:WindowRequest)
  })
_sym_db.RegisterMessage(WindowRequest)

WindowReply = _reflection.GeneratedProtocolMessageType('WindowReply', (_message.Message,), {
  'DESCRIPTOR' : _WINDOWREPLY,
  '__module__' : 'windowsystem_pb2'
  # @@protoc_insertion_point(class_scope:WindowReply)
  })
_sym_db.RegisterMessage(WindowReply)

_WINDOWOCSERVICE = DESCRIPTOR.services_by_name['WindowOcService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  _WINDOWREQUEST._serialized_start=22
  _WINDOWREQUEST._serialized_end=50
  _WINDOWREPLY._serialized_start=52
  _WINDOWREPLY._serialized_end=78
  _WINDOWOCSERVICE._serialized_start=80
  _WINDOWOCSERVICE._serialized_end=140
# @@protoc_insertion_point(module_scope)
