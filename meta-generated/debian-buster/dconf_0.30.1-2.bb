PACKAGES = "${PN} dconf-gsettings-backend dconf-service libdconf1"
PROVIDES = "dconf-gsettings-backend dconf-service libdconf1"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/d/dconf/dconf-gsettings-backend_0.30.1-2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/d/dconf/dconf-service_0.30.1-2_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/d/dconf/libdconf1_0.30.1-2_armhf.deb;unpack=0;name=deb2\
"
DEBFILENAME_dconf-gsettings-backend = "dconf-gsettings-backend_0.30.1-2_armhf.deb"
SRC_URI[deb0.sha256sum] = "b6a4efe88074e60f8bceeb8c9f89d3a7d44a84a9865b3f565ac021f5c19ea46a"
SRC_URI[deb0.md5sum] = "96c3bb1f0372bd056eb6af59278e1940"
DEBFILENAME_dconf-service = "dconf-service_0.30.1-2_armhf.deb"
SRC_URI[deb1.sha256sum] = "7dfd16a582c37477b27c4e57c3abcc65ebbe01edef289dc9d4872f642d84741d"
SRC_URI[deb1.md5sum] = "ada191e65a8456cb2d405548e2b83fb8"
DEBFILENAME_libdconf1 = "libdconf1_0.30.1-2_armhf.deb"
SRC_URI[deb2.sha256sum] = "3f627b123ef4cb47c3ac9e699a4a25090b65a7814e4ba3bedea66bf1fa8723d3"
SRC_URI[deb2.md5sum] = "e6a090cbe04599cb669393d6e6c30139"

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
