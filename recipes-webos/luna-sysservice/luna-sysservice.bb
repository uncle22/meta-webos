# Copyright (c) 2012-2014 LG Electronics, Inc.

SUMMARY = "Provides image manipulation, preference, timezone and ringtone services for Open webOS components"
AUTHOR = "Keith Derrick <keith.derrick@lge.com>"
SECTION = "webos/base"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

VIRTUAL-RUNTIME_ntp ?= "sntp"

DEPENDS = "luna-service2 libpbnjson qt4-webos uriparser libxml2 sqlite3 pmloglib cjson nyx-lib"

RDEPENDS_${PN} += "${VIRTUAL-RUNTIME_ntp}"

WEBOS_VERSION = "2.0.1-34_8573b4a26ebcce994288cbd2dfd3ee52f080fda2"
PR = "r1"

inherit webos_component
inherit webos_public_repo
inherit webos_enhanced_submissions
inherit webos_cmake
inherit webos_system_bus
inherit webos_machine_dep
inherit webos_daemon

SRC_URI = "${OPENWEBOS_GIT_REPO_COMPLETE}"
S = "${WORKDIR}/git"
