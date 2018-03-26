PACKAGES = "${PN} glib-networking glib-networking-common glib-networking-services"
PROVIDES = "glib-networking glib-networking-common glib-networking-services"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking_2.42.0-2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking-common_2.42.0-2_all.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/g/glib-networking/glib-networking-services_2.42.0-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_glib-networking = "glib-networking_2.42.0-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "6e6c21098b795bec2b1ff70e43ee61af7730521e76b31f54523f23f2c8c2e490"
SRC_URI[deb0.md5sum] = "c952458a21a2cad38ef4bff1aee25e83"
DEBFILENAME_glib-networking-common = "glib-networking-common_2.42.0-2_all.deb"
SRC_URI[deb1.sha256sum] = "f58923eeaea87db676343e7cb12e624b07df5f2fdfc0873051e4d1c1f309b4a4"
SRC_URI[deb1.md5sum] = "8a0701aa2bd74f14a6c9da34f3465c6b"
DEBFILENAME_glib-networking-services = "glib-networking-services_2.42.0-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "f9fcae09e4e1992ffff4fde96697a1824558abd2579250c3f8acd5d86a59ac0f"
SRC_URI[deb2.md5sum] = "57c9f0a91aae9cf65df0daeb31bfc817"

RDEPENDS_${PN} = "libc6 (>= 2.4) libglib2.0-0 (>= 2.41.3) libgnutls-deb0-28 (>= 3.3.8) libp11-kit0 (>= 0.11) libproxy1 (>= 0.4.11) glib-networking-services (>= 2.42.0-2) glib-networking-services (<< 2.42.0-2.1~) glib-networking-common (= 2.42.0-2) gsettings-desktop-schemas"
RDEPENDS_${PN}-services = "libc6 (>= 2.4) libglib2.0-0 (>= 2.41.3) libproxy1 (>= 0.4.11) glib-networking-common (= 2.42.0-2)"
DEPENDS = "libglib2.0-0 libgnutls-deb0-28 libp11-kit0 gsettings-desktop-schemas libc6 libproxy1"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognomeproxy.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiognutls.so \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libgiolibproxy.so \
    ./usr/share/doc/glib-networking/NEWS.gz \
    ./usr/share/doc/glib-networking/README \
    ./usr/share/doc/glib-networking/changelog.Debian.gz \
    ./usr/share/doc/glib-networking/copyright\
"
FILES_glib-networking-common = " \
    ./usr/share/doc/glib-networking-common/NEWS.gz \
    ./usr/share/doc/glib-networking-common/README \
    ./usr/share/doc/glib-networking-common/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-common/copyright \
    ./usr/share/locale/an/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ar/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/as/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/be/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bg/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/bn_IN/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ca/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ca@valencia/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/cs/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/da/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/de/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/el/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/en_CA/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/en_GB/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/eo/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/es/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/et/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/eu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fa/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/fur/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/gu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/he/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/hu/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/id/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/it/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ja/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/km/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/kn/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ko/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lt/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/lv/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ml/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/mr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nb/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/nl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/or/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pa/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pt/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ro/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ru/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sk/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sl/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sr@latin/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/sv/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ta/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/te/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/tg/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/th/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/tr/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/ug/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/uk/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/vi/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_HK/LC_MESSAGES/glib-networking.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/glib-networking.mo\
"
FILES_glib-networking-services = " \
    ./usr/lib/glib-networking/glib-pacrunner \
    ./usr/share/dbus-1/services/org.gtk.GLib.PACRunner.service \
    ./usr/share/doc/glib-networking-services/NEWS.gz \
    ./usr/share/doc/glib-networking-services/README \
    ./usr/share/doc/glib-networking-services/changelog.Debian.gz \
    ./usr/share/doc/glib-networking-services/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
