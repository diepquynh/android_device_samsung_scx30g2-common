# Copyright (C) 2017 The Lineage Project
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Inherit from scx35-common device configuration
$(call inherit-product, device/samsung/scx35-common/common.mk)

# Inherit scx30g2-common vendor tree
$(call inherit-product-if-exists, vendor/samsung/scx30g2-common/scx30g2-common-vendor.mk)

# Rootdir
PRODUCT_PACKAGES += \
	fstab.sc8830 \
	init.sc8830.rc \
	init.sc8830.usb.rc \
	ueventd.sc8830.rc

# RIL
PRODUCT_PACKAGES += \
	rild.rc

# Interactive governor configs
PRODUCT_PACKAGES += \
	interactive_gov.rc
