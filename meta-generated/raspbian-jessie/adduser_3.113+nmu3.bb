PACKAGES = "${PN} adduser"
PROVIDES = "adduser"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/a/adduser/adduser_3.113+nmu3_all.deb;unpack=0;name=deb0\
"
DEBFILENAME_adduser = "adduser_3.113+nmu3_all.deb"
SRC_URI[deb0.sha256sum] = "ae69ab0da5c36e48ba38e27c5e0886d6a67988adead5e5324b9b90736d37c11e"
SRC_URI[deb0.md5sum] = "9b7a9665cd1a6290786478931aafa9bc"

RDEPENDS_${PN} = "debconf passwd (>= 1:4.0.12) perl-base (>= 5.6.0)"
DEPENDS = "debconf passwd perl-base"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
    ./etc/deluser.conf \
    ./usr/sbin/addgroup \
    ./usr/sbin/adduser \
    ./usr/sbin/delgroup \
    ./usr/sbin/deluser \
    ./usr/share/adduser/adduser.conf \
    ./usr/share/doc/adduser/TODO.gz \
    ./usr/share/doc/adduser/changelog.gz \
    ./usr/share/doc/adduser/copyright \
    ./usr/share/doc/adduser/examples/INSTALL \
    ./usr/share/doc/adduser/examples/README \
    ./usr/share/doc/adduser/examples/adduser.local \
    ./usr/share/doc/adduser/examples/adduser.local.conf \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/adduser.conf \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/bash.bashrc \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/profile \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel.other/index.html \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bash_logout \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bash_profile \
    ./usr/share/doc/adduser/examples/adduser.local.conf.examples/skel/dot.bashrc \
    ./usr/share/lintian/overrides/adduser \
    ./usr/share/locale/ca/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/cs/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/da/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/de/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/es/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/eu/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/fr/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/hu/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/it/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/ja/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/ko/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/nb/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/nl/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/pl/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/pt/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/ru/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/sk/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/sv/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/uk/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/vi/LC_MESSAGES/adduser.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/adduser.mo \
    ./usr/share/man/da/man5/adduser.conf.5.gz \
    ./usr/share/man/da/man5/deluser.conf.5.gz \
    ./usr/share/man/da/man8/addgroup.8.gz \
    ./usr/share/man/da/man8/adduser.8.gz \
    ./usr/share/man/da/man8/delgroup.8.gz \
    ./usr/share/man/da/man8/deluser.8.gz \
    ./usr/share/man/de/man5/adduser.conf.5.gz \
    ./usr/share/man/de/man5/deluser.conf.5.gz \
    ./usr/share/man/de/man8/addgroup.8.gz \
    ./usr/share/man/de/man8/adduser.8.gz \
    ./usr/share/man/de/man8/delgroup.8.gz \
    ./usr/share/man/de/man8/deluser.8.gz \
    ./usr/share/man/es/man5/adduser.conf.5.gz \
    ./usr/share/man/es/man5/deluser.conf.5.gz \
    ./usr/share/man/es/man8/addgroup.8.gz \
    ./usr/share/man/es/man8/adduser.8.gz \
    ./usr/share/man/es/man8/delgroup.8.gz \
    ./usr/share/man/es/man8/deluser.8.gz \
    ./usr/share/man/fr/man5/adduser.conf.5.gz \
    ./usr/share/man/fr/man5/deluser.conf.5.gz \
    ./usr/share/man/fr/man8/addgroup.8.gz \
    ./usr/share/man/fr/man8/adduser.8.gz \
    ./usr/share/man/fr/man8/delgroup.8.gz \
    ./usr/share/man/fr/man8/deluser.8.gz \
    ./usr/share/man/it/man5/adduser.conf.5.gz \
    ./usr/share/man/it/man5/deluser.conf.5.gz \
    ./usr/share/man/it/man8/addgroup.8.gz \
    ./usr/share/man/it/man8/adduser.8.gz \
    ./usr/share/man/it/man8/delgroup.8.gz \
    ./usr/share/man/it/man8/deluser.8.gz \
    ./usr/share/man/man5/adduser.conf.5.gz \
    ./usr/share/man/man5/deluser.conf.5.gz \
    ./usr/share/man/man8/addgroup.8.gz \
    ./usr/share/man/man8/adduser.8.gz \
    ./usr/share/man/man8/delgroup.8.gz \
    ./usr/share/man/man8/deluser.8.gz \
    ./usr/share/man/pl/man5/adduser.conf.5.gz \
    ./usr/share/man/pl/man5/deluser.conf.5.gz \
    ./usr/share/man/pl/man8/addgroup.8.gz \
    ./usr/share/man/pl/man8/adduser.8.gz \
    ./usr/share/man/pl/man8/delgroup.8.gz \
    ./usr/share/man/pl/man8/deluser.8.gz \
    ./usr/share/man/pt/man5/adduser.conf.5.gz \
    ./usr/share/man/pt/man5/deluser.conf.5.gz \
    ./usr/share/man/pt/man8/addgroup.8.gz \
    ./usr/share/man/pt/man8/adduser.8.gz \
    ./usr/share/man/pt/man8/delgroup.8.gz \
    ./usr/share/man/pt/man8/deluser.8.gz \
    ./usr/share/man/pt_BR/man5/deluser.conf.5.gz \
    ./usr/share/man/ru/man5/adduser.conf.5.gz \
    ./usr/share/man/ru/man5/deluser.conf.5.gz \
    ./usr/share/man/ru/man8/addgroup.8.gz \
    ./usr/share/man/ru/man8/adduser.8.gz \
    ./usr/share/man/ru/man8/delgroup.8.gz \
    ./usr/share/man/ru/man8/deluser.8.gz \
    ./usr/share/man/sv/man5/adduser.conf.5.gz \
    ./usr/share/man/sv/man5/deluser.conf.5.gz \
    ./usr/share/man/sv/man8/addgroup.8.gz \
    ./usr/share/man/sv/man8/adduser.8.gz \
    ./usr/share/man/sv/man8/delgroup.8.gz \
    ./usr/share/man/sv/man8/deluser.8.gz \
    ./usr/share/perl5/Debian/AdduserCommon.pm\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
