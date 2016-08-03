PACKAGES = "glib-networking glib-networking-common glib-networking-services"
PROVIDES = "glib-networking glib-networking-common glib-networking-services"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking_2.32.3-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking-common_2.32.3-1_all.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/glib-networking/glib-networking-services_2.32.3-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_glib-networking = "glib-networking_2.32.3-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "de867543b19f091f216a2db80bb59ea596350b14bd16e874f71fb8b30fe21521"
SRC_URI[deb0.md5sum] = "1dd19ceff05256b2ae823be378133a4b"
DEBFILENAME_glib-networking-common = "glib-networking-common_2.32.3-1_all.deb"
SRC_URI[deb1.sha256sum] = "d7d5606ef8dafad4177d05fa899510df34de5ba3cf45adb13f46e32be027ed50"
SRC_URI[deb1.md5sum] = "eb96d6ffea29d4757ce31f7e64b94726"
DEBFILENAME_glib-networking-services = "glib-networking-services_2.32.3-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "d2710496a1afdec069a34a1c45b73711b79c78a8de3a622a1a8ac05165b8e0c2"
SRC_URI[deb2.md5sum] = "bd9d5aba7a980d0df69b1624677c8c63"

RDEPENDS_${PN} = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.8) libgnutls26 (>= 2.12.17-0) libp11-kit0 (>= 0.11) libproxy0 (>= 0.2.3) glib-networking-services (>= 2.32.3-1) glib-networking-services (<< 2.32.3-1.1~) glib-networking-common (= 2.32.3-1) gsettings-desktop-schemas"
RDEPENDS_${PN}-services = "libc6 (>= 2.13-28) libglib2.0-0 (>= 2.31.6) libproxy0 (>= 0.2.3) glib-networking-common (= 2.32.3-1)"
DEPENDS = "libglib2.0-0 libproxy0 libp11-kit0 libgnutls26 libc6 gsettings-desktop-schemas"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognutls.so \
	./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognomeproxy.so \
	./usr/share/doc/glib-networking/README \
	./usr/lib/arm-linux-gnueabihf/gio/modules/libgiolibproxy.so \
	./usr/share/doc/glib-networking/copyright \
	./usr/share/doc/glib-networking/changelog.Debian.gz \
	./usr/share/doc/glib-networking/NEWS.gz\
"
FILES_glib-networking-common = " \
	./usr/share/locale/hu/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/da/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/el/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/nl/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/gl/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/zh_CN/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/kn/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/hi/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ta/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ml/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/es/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/te/LC_MESSAGES/glib-networking.mo \
	./usr/share/doc/glib-networking-common/changelog.Debian.gz \
	./usr/share/locale/pa/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/sr/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/km/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/he/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/pl/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/en_CA/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/fi/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/mr/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/zh_TW/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/nb/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/fa/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ja/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/cs/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/eo/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/be/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/pt_BR/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/uk/LC_MESSAGES/glib-networking.mo \
	./usr/share/doc/glib-networking-common/NEWS.gz \
	./usr/share/locale/lv/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/de/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ro/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/th/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ca/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/lt/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/bg/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/sv/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/en_GB/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/tr/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/pt/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/et/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/gu/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ug/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/or/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ko/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/sr@latin/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/bn_IN/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/fr/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/it/LC_MESSAGES/glib-networking.mo \
	./usr/share/doc/glib-networking-common/copyright \
	./usr/share/locale/as/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/zh_HK/LC_MESSAGES/glib-networking.mo \
	./usr/share/doc/glib-networking-common/README \
	./usr/share/locale/vi/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/eu/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ca@valencia/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/id/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/ru/LC_MESSAGES/glib-networking.mo \
	./usr/share/locale/sl/LC_MESSAGES/glib-networking.mo\
"
FILES_glib-networking-services = " \
	./usr/share/doc/glib-networking-services/copyright \
	./usr/share/doc/glib-networking-services/NEWS.gz \
	./usr/share/doc/glib-networking-services/README \
	./usr/share/doc/glib-networking-services/changelog.Debian.gz \
	./usr/lib/glib-networking/glib-pacrunner \
	./usr/share/dbus-1/services/org.gtk.GLib.PACRunner.service\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
