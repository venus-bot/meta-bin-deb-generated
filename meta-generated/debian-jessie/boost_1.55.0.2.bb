PACKAGES = "${PN} libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
PROVIDES = "libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-program-options-dev_1.55.0.2_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-regex-dev_1.55.0.2_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-system-dev_1.55.0.2_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-thread-dev_1.55.0.2_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libboost-program-options-dev = "libboost-program-options-dev_1.55.0.2_armhf.deb"
SRC_URI[deb0.sha256sum] = "90454af0a483b3eb349bb7096a0ce399b1447bc7f9e26f48bd6119b07cf330d5"
SRC_URI[deb0.md5sum] = "3508d39b623fe5feb3d2b94651442f62"
DEBFILENAME_libboost-regex-dev = "libboost-regex-dev_1.55.0.2_armhf.deb"
SRC_URI[deb1.sha256sum] = "9753991752f5acaf55ff71cd56533d949896b90ca81c83c561de8dffa3aae60e"
SRC_URI[deb1.md5sum] = "46a3256eccd3d67590a550a842380961"
DEBFILENAME_libboost-system-dev = "libboost-system-dev_1.55.0.2_armhf.deb"
SRC_URI[deb2.sha256sum] = "764193ef1bc40a1a806fda75f6d33a478946becbb1b5ac49ecee2ec0977213df"
SRC_URI[deb2.md5sum] = "054ab8a61d075465e0d9934614f43f40"
DEBFILENAME_libboost-thread-dev = "libboost-thread-dev_1.55.0.2_armhf.deb"
SRC_URI[deb3.sha256sum] = "f5b76efb86ca24a0f382181b1a5784b13c7c7412a21cafcc9afdfab78ddb15cc"
SRC_URI[deb3.md5sum] = "ec65ffcf4c81da02f2ea54496e59a634"

RDEPENDS_lib${PN}-program-options-dev = "libboost-program-options1.55-dev"
RDEPENDS_lib${PN}-regex-dev = "libboost-regex1.55-dev"
RDEPENDS_lib${PN}-system-dev = "libboost-system1.55-dev"
RDEPENDS_lib${PN}-thread-dev = "libboost-thread1.55-dev"
DEPENDS = "libboost-system1.55-dev libboost-regex1.55-dev libboost-program-options1.55-dev libboost-thread1.55-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libboost-program-options-dev = " \
    ./usr/share/doc/libboost-program-options-dev/changelog.gz \
    ./usr/share/doc/libboost-program-options-dev/copyright\
"
FILES_libboost-regex-dev = " \
    ./usr/share/doc/libboost-regex-dev/copyright \
    ./usr/share/doc/libboost-regex-dev/changelog.gz\
"
FILES_libboost-system-dev = " \
    ./usr/share/doc/libboost-system-dev/copyright \
    ./usr/share/doc/libboost-system-dev/changelog.gz\
"
FILES_libboost-thread-dev = " \
    ./usr/share/doc/libboost-thread-dev/copyright \
    ./usr/share/doc/libboost-thread-dev/changelog.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
