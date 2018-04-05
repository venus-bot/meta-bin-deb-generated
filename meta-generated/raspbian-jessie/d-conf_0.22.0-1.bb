PACKAGES = "${PN} dconf-gsettings-backend dconf-service libdconf1"
PROVIDES = "dconf-gsettings-backend dconf-service libdconf1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/dconf-gsettings-backend_0.22.0-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/dconf-service_0.22.0-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/d-conf/libdconf1_0.22.0-1_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dconf-gsettings-backend = "dconf-gsettings-backend_0.22.0-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "70fcd2c3ac7bb8c904ef318851fb60097b32778d26017fbfbd97bdebc2624d9f"
SRC_URI[deb0.md5sum] = "0d82afdfdb290049671f9713eceebf0c"
DEBFILENAME_dconf-service = "dconf-service_0.22.0-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c907080f5cf2b56dcac25527f16f9322d607f0b1b3c3b9c655b462541b261e7b"
SRC_URI[deb1.md5sum] = "1e77ab68ffe19da8bf2f007c254bc28c"
DEBFILENAME_libdconf1 = "libdconf1_0.22.0-1_armhf.deb"
SRC_URI[deb2.sha256sum] = "3c8a63656f3a35dd61e7fa91c986c917c798c0c0b06673a836479070930f8277"
SRC_URI[deb2.md5sum] = "e550101e81ac93cb1f504f0c3fae491e"

RDEPENDS_dconf-gsettings-backend = "dconf-service (<< 0.22.0-1.1~) dconf-service (>= 0.22.0-1) libc6 (>= 2.4) libdconf1 (= 0.22.0-1) libglib2.0-0 (>= 2.39.1)"
RDEPENDS_dconf-service = "libc6 (>= 2.4) libdconf1 (= 0.22.0-1) libglib2.0-0 (>= 2.39.1)"
RDEPENDS_libdconf1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.39.1)"
DEPENDS = "libc6 libglib2.0-0"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_dconf-gsettings-backend = " \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libdconfsettings.so \
    ./usr/share/doc/dconf-gsettings-backend/NEWS.Debian.gz \
    ./usr/share/doc/dconf-gsettings-backend/NEWS.gz \
    ./usr/share/doc/dconf-gsettings-backend/README \
    ./usr/share/doc/dconf-gsettings-backend/changelog.Debian.gz \
    ./usr/share/doc/dconf-gsettings-backend/copyright\
"
FILES_dconf-service = " \
    ./usr/lib/dconf/dconf-service \
    ./usr/share/dbus-1/services/ca.desrt.dconf-editor.service \
    ./usr/share/dbus-1/services/ca.desrt.dconf.service \
    ./usr/share/doc/dconf-service/NEWS.Debian.gz \
    ./usr/share/doc/dconf-service/NEWS.gz \
    ./usr/share/doc/dconf-service/README \
    ./usr/share/doc/dconf-service/changelog.Debian.gz \
    ./usr/share/doc/dconf-service/copyright \
    ./usr/share/man/man1/dconf-service.1.gz\
"
FILES_libdconf1 = " \
    ./usr/lib/arm-linux-gnueabihf/libdconf.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libdconf.so.1.0.0 \
    ./usr/share/doc/libdconf1/NEWS.Debian.gz \
    ./usr/share/doc/libdconf1/NEWS.gz \
    ./usr/share/doc/libdconf1/README \
    ./usr/share/doc/libdconf1/changelog.Debian.gz \
    ./usr/share/doc/libdconf1/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
