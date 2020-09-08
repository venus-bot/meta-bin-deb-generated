PACKAGES = "${PN} dconf-gsettings-backend dconf-service libdconf1"
PROVIDES = "dconf-gsettings-backend dconf-service libdconf1"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/d/dconf/dconf-gsettings-backend_0.30.1-2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/d/dconf/dconf-service_0.30.1-2_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/d/dconf/libdconf1_0.30.1-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dconf-gsettings-backend = "dconf-gsettings-backend_0.30.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "61bd02ba2da9e549e245ab2f5152baa2f27ea40fd0b0cde5873c63048feaa708"
SRC_URI[deb0.md5sum] = "8bcf5154064a17e89917170cdcf78bc7"
DEBFILENAME_dconf-service = "dconf-service_0.30.1-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "2ddc0eddff21e18afda15379d6414ffea5ea21a10e958c2ddc85625feab5cf70"
SRC_URI[deb1.md5sum] = "4a16b43dded8d081471829270bbd65ac"
DEBFILENAME_libdconf1 = "libdconf1_0.30.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "6ede031759943492bbc180e8d370b68d22279158a73ed692501b0e2347491cde"
SRC_URI[deb2.md5sum] = "b6c4f481b2093ba3a42840439980517b"

RDEPENDS_${PN}-gsettings-backend = "dconf-service (<< 0.30.1-2.1~) dconf-service (>= 0.30.1-2) libc6 (>= 2.4) libdconf1 (= 0.30.1-2) libglib2.0-0 (>= 2.55.2)"
RDEPENDS_${PN}-service = "default-dbus-session-bus libc6 (>= 2.28) libdconf1 (= 0.30.1-2) libglib2.0-0 (>= 2.55.2)"
RDEPENDS_lib${PN}1 = "libc6 (>= 2.4) libglib2.0-0 (>= 2.55.2)"
DEPENDS = "default-dbus-session-bus libc6 libglib2.0-0"


inherit deb_group

FILES_dconf-gsettings-backend = " \
    ./usr/lib/arm-linux-gnueabihf/gio/modules/libdconfsettings.so \
    ./usr/share/doc/dconf-gsettings-backend/changelog.Debian.gz \
    ./usr/share/doc/dconf-gsettings-backend/copyright\
"
FILES_dconf-service = " \
    ./usr/lib/dconf/dconf-service \
    ./usr/share/dbus-1/services/ca.desrt.dconf.service \
    ./usr/share/doc/dconf-service/changelog.Debian.gz \
    ./usr/share/doc/dconf-service/copyright \
    ./usr/share/man/man1/dconf-service.1.gz\
"
FILES_libdconf1 = " \
    ./usr/lib/arm-linux-gnueabihf/libdconf.so.1 \
    ./usr/lib/arm-linux-gnueabihf/libdconf.so.1.0.0 \
    ./usr/share/doc/libdconf1/NEWS.gz \
    ./usr/share/doc/libdconf1/README \
    ./usr/share/doc/libdconf1/changelog.Debian.gz \
    ./usr/share/doc/libdconf1/copyright\
"
