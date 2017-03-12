# Copyright (C) 2017 The Lineage Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Inherit from SCX35 common configs
-include device/samsung/scx35-common/BoardConfigCommon.mk

# RIL
BOARD_RIL_CLASS += ../../../device/samsung/scx30g2-common/ril

# System properties
TARGET_SYSTEM_PROP += device/samsung/scx30g2-common/system.prop
