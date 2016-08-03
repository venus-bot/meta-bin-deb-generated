PACKAGES = "libgnome-keyring-common libgnome-keyring0"
PROVIDES = "libgnome-keyring-common libgnome-keyring0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libg/libgnome-keyring/libgnome-keyring-common_3.4.1-1_all.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libg/libgnome-keyring/libgnome-keyring0_3.4.1-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libgnome-keyring-common = "libgnome-keyring-common_3.4.1-1_all.deb"
SRC_URI[deb0.sha256sum] = "b6b36b1669e0ac267247e95557e821e2b01c5dde3b0d91f0175933c7c02aebc8"
SRC_URI[deb0.md5sum] = "d63208bbd4baa65d4a04a776051d5db3"
DEBFILENAME_libgnome-keyring0 = "libgnome-keyring0_3.4.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "f3f303d1df13d4c3ea6d4439917a22825453c6f01ced0b22c562946babcacc1c"
SRC_URI[deb1.md5sum] = "7095283ddd3c7ae42dfd451f84204ea1"

RDEPENDS_${PN}0 = "libc6 (>= 2.13-28) libdbus-1-3 (>= 1.1.1) libgcrypt11 (>= 1.4.5) libglib2.0-0 (>= 2.31.8) libgnome-keyring-common (= 3.4.1-1)"
DEPENDS = "libglib2.0-0 libdbus-1-3 libgcrypt11 libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libgnome-keyring-common = " \
	./usr/share/locale/uz@cyrillic/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/as/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/tr/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ms/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/copyright \
	./usr/share/locale/en_GB/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/changelog.Debian.gz \
	./usr/share/locale/lv/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/zh_HK/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/it/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/sl/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/gu/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/eo/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/da/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/af/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/fi/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/hu/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ca/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ja/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/lt/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/hi/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ug/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/bg/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/th/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/or/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/es/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ast/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/sv/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/el/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/de/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ca@valencia/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/he/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/an/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/et/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/nb/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/te/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/nn/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/cs/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/fr/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/fy/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/zh_TW/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/nds/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ml/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ro/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/sr/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/pl/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/pt_BR/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/id/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/bn/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/nl/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/mn/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/pa/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/be/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ko/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/NEWS.gz \
	./usr/share/locale/km/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/AUTHORS \
	./usr/share/locale/vi/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/ta/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/fa/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/gl/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/uk/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/README \
	./usr/share/locale/ar/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/pt/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/kn/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/eu/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/doc/libgnome-keyring-common/changelog.gz \
	./usr/share/locale/ru/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/sr@latin/LC_MESSAGES/libgnome-keyring.mo \
	./usr/share/locale/sk/LC_MESSAGES/libgnome-keyring.mo\
"
FILES_libgnome-keyring0 = " \
	./usr/share/doc/libgnome-keyring0/README \
	./usr/share/doc/libgnome-keyring0/NEWS.gz \
	./usr/share/doc/libgnome-keyring0/copyright \
	./usr/share/doc/libgnome-keyring0/changelog.gz \
	./usr/share/doc/libgnome-keyring0/changelog.Debian.gz \
	./usr/lib/arm-linux-gnueabihf/libgnome-keyring.so.0.2.0 \
	./usr/lib/arm-linux-gnueabihf/libgnome-keyring.so.0 \
	./usr/share/doc/libgnome-keyring0/AUTHORS\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
