PACKAGES = "${PN} libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
PROVIDES = "libboost-program-options-dev libboost-regex-dev libboost-system-dev libboost-thread-dev"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-program-options-dev_1.67.0.1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-regex-dev_1.67.0.1_armhf.deb;unpack=0;name=deb1\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-system-dev_1.67.0.1_armhf.deb;unpack=0;name=deb2\
	http://ftp.de.debian.org/debian/pool/main/b/boost-defaults/libboost-thread-dev_1.67.0.1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libboost-program-options-dev = "libboost-program-options-dev_1.67.0.1_armhf.deb"
SRC_URI[deb0.sha256sum] = "82c7c37c939ea0c76d9730a0253c24d5c39df57bb69c7c9986fd9dc572d713a8"
SRC_URI[deb0.md5sum] = "beef47ba202945203d982dd72b04f168"
DEBFILENAME_libboost-regex-dev = "libboost-regex-dev_1.67.0.1_armhf.deb"
SRC_URI[deb1.sha256sum] = "5098b74c931fe307daf68124eef96cf5fc52f5e4f9c30acc88d66ef0a970603e"
SRC_URI[deb1.md5sum] = "5e0e6c57d6425fe84ce1c7a5b2fd9087"
DEBFILENAME_libboost-system-dev = "libboost-system-dev_1.67.0.1_armhf.deb"
SRC_URI[deb2.sha256sum] = "f51df1079baf46cde903e454fe52569e3846b46d20fc895388364b8454c79c87"
SRC_URI[deb2.md5sum] = "2fad0b318a4a39dc051b6a6bfcf0e7d4"
DEBFILENAME_libboost-thread-dev = "libboost-thread-dev_1.67.0.1_armhf.deb"
SRC_URI[deb3.sha256sum] = "58586f7c136752d60e9c687edc11380ba83ea21b92c5f1c06dab5ce88849d607"
SRC_URI[deb3.md5sum] = "b278d3c3a3ea076a60fd0cbacda032c4"

RDEPENDS_lib${PN}-program-options-dev = "libboost-program-options1.67-dev"
RDEPENDS_lib${PN}-regex-dev = "libboost-regex1.67-dev"
RDEPENDS_lib${PN}-system-dev = "libboost-system1.67-dev"
RDEPENDS_lib${PN}-thread-dev = "libboost-thread1.67-dev"
DEPENDS = "libboost-program-options1.67-dev libboost-regex1.67-dev libboost-system1.67-dev libboost-thread1.67-dev"


inherit deb_group

FILES_libboost-program-options-dev = " \
    ./usr/share/doc/libboost-program-options-dev/changelog.gz \
    ./usr/share/doc/libboost-program-options-dev/copyright\
"
FILES_libboost-regex-dev = " \
    ./usr/share/doc/libboost-regex-dev/changelog.gz \
    ./usr/share/doc/libboost-regex-dev/copyright\
"
FILES_libboost-system-dev = " \
    ./usr/share/doc/libboost-system-dev/changelog.gz \
    ./usr/share/doc/libboost-system-dev/copyright\
"
FILES_libboost-thread-dev = " \
    ./usr/share/doc/libboost-thread-dev/changelog.gz \
    ./usr/share/doc/libboost-thread-dev/copyright\
"
