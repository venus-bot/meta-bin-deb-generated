PACKAGES = "${PN} libglib2.0-0 libglib2.0-bin libglib2.0-data libglib2.0-dev"
PROVIDES = "libglib2.0-0 libglib2.0-bin libglib2.0-data libglib2.0-dev"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-0_2.42.1-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-bin_2.42.1-1_armhf.deb;unpack=0;name=deb1\
	http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-data_2.42.1-1_all.deb;unpack=0;name=deb2\
	http://archive.raspbian.org/raspbian/pool/main/g/glib2.0/libglib2.0-dev_2.42.1-1_armhf.deb;unpack=0;name=deb3\
"
DEBFILENAME_libglib2.0-0 = "libglib2.0-0_2.42.1-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "97d46cfa9882bee47f9ef1b6b32ad203f5330d3af59b5bed440dfebab7c536d9"
SRC_URI[deb0.md5sum] = "d771e5a71dd51804a073fc521c79b27c"
DEBFILENAME_libglib2.0-bin = "libglib2.0-bin_2.42.1-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "c806f82bdf8e63650c7f48267017dc7bbb7e1d8ceb536620b56c53ffa4bd81f7"
SRC_URI[deb1.md5sum] = "685866f6a760d8122bce808469536c01"
DEBFILENAME_libglib2.0-data = "libglib2.0-data_2.42.1-1_all.deb"
SRC_URI[deb2.sha256sum] = "15c1e8de648a00a1599e16a7680359f973c9fd58a96d881016678baa8c42a8dd"
SRC_URI[deb2.md5sum] = "69999793908a1770f0bf05f9a17b0fa8"
DEBFILENAME_libglib2.0-dev = "libglib2.0-dev_2.42.1-1_armhf.deb"
SRC_URI[deb3.sha256sum] = "d3e5bb4e36fd45ccbcadf92d7413193d47cbe9b49b2ef064a2f93ddd083a61bb"
SRC_URI[deb3.md5sum] = "a109aea537d64fb75b2ffe5674628f2b"

RDEPENDS_lib${PN}-0 = "libc6 (>= 2.17) libffi6 (>= 3.0.4) libpcre3 (>= 8.10) libselinux1 (>= 1.32) zlib1g (>= 1:1.2.2)"
RDEPENDS_lib${PN}-bin = "libc6 (>= 2.4) libelfg0 (>= 0.8.12) libglib2.0-0 (= 2.42.1-1) libglib2.0-data"
RDEPENDS_lib${PN}-dev = "libc6 (>= 2.4) libglib2.0-0 (= 2.42.1-1) python (>= 2.6.6-7~) libglib2.0-bin (= 2.42.1-1) libpcre3-dev (>= 1:8.31)  zlib1g-dev"
DEPENDS = " libpcre3 libelfg0 libffi6 python zlib1g-dev zlib1g libselinux1 libpcre3-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libglib2.0-0 = " \
    ./lib/arm-linux-gnueabihf/libglib-2.0.so.0 \
    ./lib/arm-linux-gnueabihf/libglib-2.0.so.0.4200.1 \
    ./usr/lib/arm-linux-gnueabihf/glib-2.0/gio-querymodules \
    ./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-resources \
    ./usr/lib/arm-linux-gnueabihf/glib-2.0/glib-compile-schemas \
    ./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libgio-2.0.so.0.4200.1 \
    ./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so.0.4200.1 \
    ./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so.0.4200.1 \
    ./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0 \
    ./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so.0.4200.1 \
    ./usr/share/doc/libglib2.0-0/AUTHORS \
    ./usr/share/doc/libglib2.0-0/ChangeLog.pre-1-2.gz \
    ./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-0.gz \
    ./usr/share/doc/libglib2.0-0/ChangeLog.pre-2-2.gz \
    ./usr/share/doc/libglib2.0-0/NEWS.gz \
    ./usr/share/doc/libglib2.0-0/NEWS.pre-1-3.gz \
    ./usr/share/doc/libglib2.0-0/README.gz \
    ./usr/share/doc/libglib2.0-0/changelog.Debian.gz \
    ./usr/share/doc/libglib2.0-0/changelog.gz \
    ./usr/share/doc/libglib2.0-0/copyright \
    ./usr/share/lintian/overrides/libglib2.0-0\
"
FILES_libglib2.0-bin = " \
    ./usr/bin/gapplication \
    ./usr/bin/gdbus \
    ./usr/bin/gio-querymodules \
    ./usr/bin/glib-compile-resources \
    ./usr/bin/glib-compile-schemas \
    ./usr/bin/gresource \
    ./usr/bin/gsettings \
    ./usr/share/bash-completion/completions/gapplication \
    ./usr/share/bash-completion/completions/gdbus \
    ./usr/share/bash-completion/completions/gresource \
    ./usr/share/bash-completion/completions/gsettings \
    ./usr/share/doc/libglib2.0-bin/AUTHORS \
    ./usr/share/doc/libglib2.0-bin/NEWS.gz \
    ./usr/share/doc/libglib2.0-bin/README.gz \
    ./usr/share/doc/libglib2.0-bin/changelog.Debian.gz \
    ./usr/share/doc/libglib2.0-bin/changelog.gz \
    ./usr/share/doc/libglib2.0-bin/copyright \
    ./usr/share/man/man1/gdbus.1.gz \
    ./usr/share/man/man1/gio-querymodules.1.gz \
    ./usr/share/man/man1/glib-compile-resources.1.gz \
    ./usr/share/man/man1/glib-compile-schemas.1.gz \
    ./usr/share/man/man1/gresource.1.gz \
    ./usr/share/man/man1/gsettings.1.gz\
"
FILES_libglib2.0-data = " \
    ./usr/share/doc/libglib2.0-data/AUTHORS \
    ./usr/share/doc/libglib2.0-data/NEWS.gz \
    ./usr/share/doc/libglib2.0-data/README.gz \
    ./usr/share/doc/libglib2.0-data/changelog.Debian.gz \
    ./usr/share/doc/libglib2.0-data/changelog.gz \
    ./usr/share/doc/libglib2.0-data/copyright \
    ./usr/share/locale/af/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/am/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/an/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ar/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/as/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ast/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/az/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/be/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/be@latin/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/bg/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/bn/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/bn_IN/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/bs/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ca/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ca@valencia/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/cs/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/cy/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/da/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/de/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/dz/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/el/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/en@shaw/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/en_CA/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/en_GB/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/eo/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/es/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/et/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/eu/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/fa/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/fi/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/fr/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ga/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/gl/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/gu/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/he/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/hi/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/hr/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/hu/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/hy/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/id/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/is/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/it/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ja/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ka/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/kk/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/kn/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ko/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ku/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/lt/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/lv/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/mai/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/mg/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/mk/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ml/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/mn/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/mr/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ms/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/nb/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/nds/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ne/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/nl/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/nn/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/oc/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/or/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/pa/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/pl/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ps/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/pt/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/pt_BR/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ro/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ru/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/rw/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/si/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sk/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sl/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sq/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sr/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sr@ije/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sr@latin/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/sv/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ta/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/te/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/tg/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/th/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/tl/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/tr/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/tt/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/ug/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/uk/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/vi/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/wa/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/xh/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/yi/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/zh_CN/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/zh_HK/LC_MESSAGES/glib20.mo \
    ./usr/share/locale/zh_TW/LC_MESSAGES/glib20.mo\
"
FILES_libglib2.0-dev = " \
    ./usr/bin/gdbus-codegen \
    ./usr/bin/glib-genmarshal \
    ./usr/bin/glib-gettextize \
    ./usr/bin/glib-mkenums \
    ./usr/bin/gobject-query \
    ./usr/bin/gtester \
    ./usr/bin/gtester-report \
    ./usr/include/gio-unix-2.0/gio/gdesktopappinfo.h \
    ./usr/include/gio-unix-2.0/gio/gfiledescriptorbased.h \
    ./usr/include/gio-unix-2.0/gio/gunixconnection.h \
    ./usr/include/gio-unix-2.0/gio/gunixcredentialsmessage.h \
    ./usr/include/gio-unix-2.0/gio/gunixfdlist.h \
    ./usr/include/gio-unix-2.0/gio/gunixfdmessage.h \
    ./usr/include/gio-unix-2.0/gio/gunixinputstream.h \
    ./usr/include/gio-unix-2.0/gio/gunixmounts.h \
    ./usr/include/gio-unix-2.0/gio/gunixoutputstream.h \
    ./usr/include/gio-unix-2.0/gio/gunixsocketaddress.h \
    ./usr/include/glib-2.0/gio/gaction.h \
    ./usr/include/glib-2.0/gio/gactiongroup.h \
    ./usr/include/glib-2.0/gio/gactiongroupexporter.h \
    ./usr/include/glib-2.0/gio/gactionmap.h \
    ./usr/include/glib-2.0/gio/gappinfo.h \
    ./usr/include/glib-2.0/gio/gapplication.h \
    ./usr/include/glib-2.0/gio/gapplicationcommandline.h \
    ./usr/include/glib-2.0/gio/gasyncinitable.h \
    ./usr/include/glib-2.0/gio/gasyncresult.h \
    ./usr/include/glib-2.0/gio/gbufferedinputstream.h \
    ./usr/include/glib-2.0/gio/gbufferedoutputstream.h \
    ./usr/include/glib-2.0/gio/gbytesicon.h \
    ./usr/include/glib-2.0/gio/gcancellable.h \
    ./usr/include/glib-2.0/gio/gcharsetconverter.h \
    ./usr/include/glib-2.0/gio/gcontenttype.h \
    ./usr/include/glib-2.0/gio/gconverter.h \
    ./usr/include/glib-2.0/gio/gconverterinputstream.h \
    ./usr/include/glib-2.0/gio/gconverteroutputstream.h \
    ./usr/include/glib-2.0/gio/gcredentials.h \
    ./usr/include/glib-2.0/gio/gdatainputstream.h \
    ./usr/include/glib-2.0/gio/gdataoutputstream.h \
    ./usr/include/glib-2.0/gio/gdbusactiongroup.h \
    ./usr/include/glib-2.0/gio/gdbusaddress.h \
    ./usr/include/glib-2.0/gio/gdbusauthobserver.h \
    ./usr/include/glib-2.0/gio/gdbusconnection.h \
    ./usr/include/glib-2.0/gio/gdbuserror.h \
    ./usr/include/glib-2.0/gio/gdbusinterface.h \
    ./usr/include/glib-2.0/gio/gdbusinterfaceskeleton.h \
    ./usr/include/glib-2.0/gio/gdbusintrospection.h \
    ./usr/include/glib-2.0/gio/gdbusmenumodel.h \
    ./usr/include/glib-2.0/gio/gdbusmessage.h \
    ./usr/include/glib-2.0/gio/gdbusmethodinvocation.h \
    ./usr/include/glib-2.0/gio/gdbusnameowning.h \
    ./usr/include/glib-2.0/gio/gdbusnamewatching.h \
    ./usr/include/glib-2.0/gio/gdbusobject.h \
    ./usr/include/glib-2.0/gio/gdbusobjectmanager.h \
    ./usr/include/glib-2.0/gio/gdbusobjectmanagerclient.h \
    ./usr/include/glib-2.0/gio/gdbusobjectmanagerserver.h \
    ./usr/include/glib-2.0/gio/gdbusobjectproxy.h \
    ./usr/include/glib-2.0/gio/gdbusobjectskeleton.h \
    ./usr/include/glib-2.0/gio/gdbusproxy.h \
    ./usr/include/glib-2.0/gio/gdbusserver.h \
    ./usr/include/glib-2.0/gio/gdbusutils.h \
    ./usr/include/glib-2.0/gio/gdrive.h \
    ./usr/include/glib-2.0/gio/gemblem.h \
    ./usr/include/glib-2.0/gio/gemblemedicon.h \
    ./usr/include/glib-2.0/gio/gfile.h \
    ./usr/include/glib-2.0/gio/gfileattribute.h \
    ./usr/include/glib-2.0/gio/gfileenumerator.h \
    ./usr/include/glib-2.0/gio/gfileicon.h \
    ./usr/include/glib-2.0/gio/gfileinfo.h \
    ./usr/include/glib-2.0/gio/gfileinputstream.h \
    ./usr/include/glib-2.0/gio/gfileiostream.h \
    ./usr/include/glib-2.0/gio/gfilemonitor.h \
    ./usr/include/glib-2.0/gio/gfilenamecompleter.h \
    ./usr/include/glib-2.0/gio/gfileoutputstream.h \
    ./usr/include/glib-2.0/gio/gfilterinputstream.h \
    ./usr/include/glib-2.0/gio/gfilteroutputstream.h \
    ./usr/include/glib-2.0/gio/gicon.h \
    ./usr/include/glib-2.0/gio/ginetaddress.h \
    ./usr/include/glib-2.0/gio/ginetaddressmask.h \
    ./usr/include/glib-2.0/gio/ginetsocketaddress.h \
    ./usr/include/glib-2.0/gio/ginitable.h \
    ./usr/include/glib-2.0/gio/ginputstream.h \
    ./usr/include/glib-2.0/gio/gio.h \
    ./usr/include/glib-2.0/gio/gioenums.h \
    ./usr/include/glib-2.0/gio/gioenumtypes.h \
    ./usr/include/glib-2.0/gio/gioerror.h \
    ./usr/include/glib-2.0/gio/giomodule.h \
    ./usr/include/glib-2.0/gio/gioscheduler.h \
    ./usr/include/glib-2.0/gio/giostream.h \
    ./usr/include/glib-2.0/gio/giotypes.h \
    ./usr/include/glib-2.0/gio/gloadableicon.h \
    ./usr/include/glib-2.0/gio/gmemoryinputstream.h \
    ./usr/include/glib-2.0/gio/gmemoryoutputstream.h \
    ./usr/include/glib-2.0/gio/gmenu.h \
    ./usr/include/glib-2.0/gio/gmenuexporter.h \
    ./usr/include/glib-2.0/gio/gmenumodel.h \
    ./usr/include/glib-2.0/gio/gmount.h \
    ./usr/include/glib-2.0/gio/gmountoperation.h \
    ./usr/include/glib-2.0/gio/gnativevolumemonitor.h \
    ./usr/include/glib-2.0/gio/gnetworkaddress.h \
    ./usr/include/glib-2.0/gio/gnetworking.h \
    ./usr/include/glib-2.0/gio/gnetworkmonitor.h \
    ./usr/include/glib-2.0/gio/gnetworkservice.h \
    ./usr/include/glib-2.0/gio/gnotification.h \
    ./usr/include/glib-2.0/gio/goutputstream.h \
    ./usr/include/glib-2.0/gio/gpermission.h \
    ./usr/include/glib-2.0/gio/gpollableinputstream.h \
    ./usr/include/glib-2.0/gio/gpollableoutputstream.h \
    ./usr/include/glib-2.0/gio/gpollableutils.h \
    ./usr/include/glib-2.0/gio/gpropertyaction.h \
    ./usr/include/glib-2.0/gio/gproxy.h \
    ./usr/include/glib-2.0/gio/gproxyaddress.h \
    ./usr/include/glib-2.0/gio/gproxyaddressenumerator.h \
    ./usr/include/glib-2.0/gio/gproxyresolver.h \
    ./usr/include/glib-2.0/gio/gremoteactiongroup.h \
    ./usr/include/glib-2.0/gio/gresolver.h \
    ./usr/include/glib-2.0/gio/gresource.h \
    ./usr/include/glib-2.0/gio/gseekable.h \
    ./usr/include/glib-2.0/gio/gsettings.h \
    ./usr/include/glib-2.0/gio/gsettingsbackend.h \
    ./usr/include/glib-2.0/gio/gsettingsschema.h \
    ./usr/include/glib-2.0/gio/gsimpleaction.h \
    ./usr/include/glib-2.0/gio/gsimpleactiongroup.h \
    ./usr/include/glib-2.0/gio/gsimpleasyncresult.h \
    ./usr/include/glib-2.0/gio/gsimplepermission.h \
    ./usr/include/glib-2.0/gio/gsimpleproxyresolver.h \
    ./usr/include/glib-2.0/gio/gsocket.h \
    ./usr/include/glib-2.0/gio/gsocketaddress.h \
    ./usr/include/glib-2.0/gio/gsocketaddressenumerator.h \
    ./usr/include/glib-2.0/gio/gsocketclient.h \
    ./usr/include/glib-2.0/gio/gsocketconnectable.h \
    ./usr/include/glib-2.0/gio/gsocketconnection.h \
    ./usr/include/glib-2.0/gio/gsocketcontrolmessage.h \
    ./usr/include/glib-2.0/gio/gsocketlistener.h \
    ./usr/include/glib-2.0/gio/gsocketservice.h \
    ./usr/include/glib-2.0/gio/gsrvtarget.h \
    ./usr/include/glib-2.0/gio/gsubprocess.h \
    ./usr/include/glib-2.0/gio/gsubprocesslauncher.h \
    ./usr/include/glib-2.0/gio/gtask.h \
    ./usr/include/glib-2.0/gio/gtcpconnection.h \
    ./usr/include/glib-2.0/gio/gtcpwrapperconnection.h \
    ./usr/include/glib-2.0/gio/gtestdbus.h \
    ./usr/include/glib-2.0/gio/gthemedicon.h \
    ./usr/include/glib-2.0/gio/gthreadedsocketservice.h \
    ./usr/include/glib-2.0/gio/gtlsbackend.h \
    ./usr/include/glib-2.0/gio/gtlscertificate.h \
    ./usr/include/glib-2.0/gio/gtlsclientconnection.h \
    ./usr/include/glib-2.0/gio/gtlsconnection.h \
    ./usr/include/glib-2.0/gio/gtlsdatabase.h \
    ./usr/include/glib-2.0/gio/gtlsfiledatabase.h \
    ./usr/include/glib-2.0/gio/gtlsinteraction.h \
    ./usr/include/glib-2.0/gio/gtlspassword.h \
    ./usr/include/glib-2.0/gio/gtlsserverconnection.h \
    ./usr/include/glib-2.0/gio/gvfs.h \
    ./usr/include/glib-2.0/gio/gvolume.h \
    ./usr/include/glib-2.0/gio/gvolumemonitor.h \
    ./usr/include/glib-2.0/gio/gzlibcompressor.h \
    ./usr/include/glib-2.0/gio/gzlibdecompressor.h \
    ./usr/include/glib-2.0/glib-object.h \
    ./usr/include/glib-2.0/glib-unix.h \
    ./usr/include/glib-2.0/glib.h \
    ./usr/include/glib-2.0/glib/deprecated/gallocator.h \
    ./usr/include/glib-2.0/glib/deprecated/gcache.h \
    ./usr/include/glib-2.0/glib/deprecated/gcompletion.h \
    ./usr/include/glib-2.0/glib/deprecated/gmain.h \
    ./usr/include/glib-2.0/glib/deprecated/grel.h \
    ./usr/include/glib-2.0/glib/deprecated/gthread.h \
    ./usr/include/glib-2.0/glib/galloca.h \
    ./usr/include/glib-2.0/glib/garray.h \
    ./usr/include/glib-2.0/glib/gasyncqueue.h \
    ./usr/include/glib-2.0/glib/gatomic.h \
    ./usr/include/glib-2.0/glib/gbacktrace.h \
    ./usr/include/glib-2.0/glib/gbase64.h \
    ./usr/include/glib-2.0/glib/gbitlock.h \
    ./usr/include/glib-2.0/glib/gbookmarkfile.h \
    ./usr/include/glib-2.0/glib/gbytes.h \
    ./usr/include/glib-2.0/glib/gcharset.h \
    ./usr/include/glib-2.0/glib/gchecksum.h \
    ./usr/include/glib-2.0/glib/gconvert.h \
    ./usr/include/glib-2.0/glib/gdataset.h \
    ./usr/include/glib-2.0/glib/gdate.h \
    ./usr/include/glib-2.0/glib/gdatetime.h \
    ./usr/include/glib-2.0/glib/gdir.h \
    ./usr/include/glib-2.0/glib/genviron.h \
    ./usr/include/glib-2.0/glib/gerror.h \
    ./usr/include/glib-2.0/glib/gfileutils.h \
    ./usr/include/glib-2.0/glib/ggettext.h \
    ./usr/include/glib-2.0/glib/ghash.h \
    ./usr/include/glib-2.0/glib/ghmac.h \
    ./usr/include/glib-2.0/glib/ghook.h \
    ./usr/include/glib-2.0/glib/ghostutils.h \
    ./usr/include/glib-2.0/glib/gi18n-lib.h \
    ./usr/include/glib-2.0/glib/gi18n.h \
    ./usr/include/glib-2.0/glib/giochannel.h \
    ./usr/include/glib-2.0/glib/gkeyfile.h \
    ./usr/include/glib-2.0/glib/glist.h \
    ./usr/include/glib-2.0/glib/gmacros.h \
    ./usr/include/glib-2.0/glib/gmain.h \
    ./usr/include/glib-2.0/glib/gmappedfile.h \
    ./usr/include/glib-2.0/glib/gmarkup.h \
    ./usr/include/glib-2.0/glib/gmem.h \
    ./usr/include/glib-2.0/glib/gmessages.h \
    ./usr/include/glib-2.0/glib/gnode.h \
    ./usr/include/glib-2.0/glib/goption.h \
    ./usr/include/glib-2.0/glib/gpattern.h \
    ./usr/include/glib-2.0/glib/gpoll.h \
    ./usr/include/glib-2.0/glib/gprimes.h \
    ./usr/include/glib-2.0/glib/gprintf.h \
    ./usr/include/glib-2.0/glib/gqsort.h \
    ./usr/include/glib-2.0/glib/gquark.h \
    ./usr/include/glib-2.0/glib/gqueue.h \
    ./usr/include/glib-2.0/glib/grand.h \
    ./usr/include/glib-2.0/glib/gregex.h \
    ./usr/include/glib-2.0/glib/gscanner.h \
    ./usr/include/glib-2.0/glib/gsequence.h \
    ./usr/include/glib-2.0/glib/gshell.h \
    ./usr/include/glib-2.0/glib/gslice.h \
    ./usr/include/glib-2.0/glib/gslist.h \
    ./usr/include/glib-2.0/glib/gspawn.h \
    ./usr/include/glib-2.0/glib/gstdio.h \
    ./usr/include/glib-2.0/glib/gstrfuncs.h \
    ./usr/include/glib-2.0/glib/gstring.h \
    ./usr/include/glib-2.0/glib/gstringchunk.h \
    ./usr/include/glib-2.0/glib/gtestutils.h \
    ./usr/include/glib-2.0/glib/gthread.h \
    ./usr/include/glib-2.0/glib/gthreadpool.h \
    ./usr/include/glib-2.0/glib/gtimer.h \
    ./usr/include/glib-2.0/glib/gtimezone.h \
    ./usr/include/glib-2.0/glib/gtrashstack.h \
    ./usr/include/glib-2.0/glib/gtree.h \
    ./usr/include/glib-2.0/glib/gtypes.h \
    ./usr/include/glib-2.0/glib/gunicode.h \
    ./usr/include/glib-2.0/glib/gurifuncs.h \
    ./usr/include/glib-2.0/glib/gutils.h \
    ./usr/include/glib-2.0/glib/gvariant.h \
    ./usr/include/glib-2.0/glib/gvarianttype.h \
    ./usr/include/glib-2.0/glib/gversion.h \
    ./usr/include/glib-2.0/glib/gversionmacros.h \
    ./usr/include/glib-2.0/glib/gwin32.h \
    ./usr/include/glib-2.0/gmodule.h \
    ./usr/include/glib-2.0/gobject/gbinding.h \
    ./usr/include/glib-2.0/gobject/gboxed.h \
    ./usr/include/glib-2.0/gobject/gclosure.h \
    ./usr/include/glib-2.0/gobject/genums.h \
    ./usr/include/glib-2.0/gobject/glib-types.h \
    ./usr/include/glib-2.0/gobject/gmarshal.h \
    ./usr/include/glib-2.0/gobject/gobject.h \
    ./usr/include/glib-2.0/gobject/gobjectnotifyqueue.c \
    ./usr/include/glib-2.0/gobject/gparam.h \
    ./usr/include/glib-2.0/gobject/gparamspecs.h \
    ./usr/include/glib-2.0/gobject/gsignal.h \
    ./usr/include/glib-2.0/gobject/gsourceclosure.h \
    ./usr/include/glib-2.0/gobject/gtype.h \
    ./usr/include/glib-2.0/gobject/gtypemodule.h \
    ./usr/include/glib-2.0/gobject/gtypeplugin.h \
    ./usr/include/glib-2.0/gobject/gvalue.h \
    ./usr/include/glib-2.0/gobject/gvaluearray.h \
    ./usr/include/glib-2.0/gobject/gvaluecollector.h \
    ./usr/include/glib-2.0/gobject/gvaluetypes.h \
    ./usr/lib/arm-linux-gnueabihf/glib-2.0/include/glibconfig.h \
    ./usr/lib/arm-linux-gnueabihf/libgio-2.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgio-2.0.so \
    ./usr/lib/arm-linux-gnueabihf/libglib-2.0.a \
    ./usr/lib/arm-linux-gnueabihf/libglib-2.0.so \
    ./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgmodule-2.0.so \
    ./usr/lib/arm-linux-gnueabihf/libgobject-2.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgobject-2.0.so \
    ./usr/lib/arm-linux-gnueabihf/libgthread-2.0.a \
    ./usr/lib/arm-linux-gnueabihf/libgthread-2.0.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gio-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gio-unix-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/glib-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gmodule-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gmodule-export-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gmodule-no-export-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gobject-2.0.pc \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/gthread-2.0.pc \
    ./usr/share/aclocal/glib-2.0.m4 \
    ./usr/share/aclocal/glib-gettext.m4 \
    ./usr/share/aclocal/gsettings.m4 \
    ./usr/share/doc/libglib2.0-dev/AUTHORS \
    ./usr/share/doc/libglib2.0-dev/NEWS.gz \
    ./usr/share/doc/libglib2.0-dev/README.Debian \
    ./usr/share/doc/libglib2.0-dev/README.gz \
    ./usr/share/doc/libglib2.0-dev/changelog.Debian.gz \
    ./usr/share/doc/libglib2.0-dev/changelog.gz \
    ./usr/share/doc/libglib2.0-dev/copyright \
    ./usr/share/gdb/auto-load/libglib-2.0.so.0.4200.1-gdb.py \
    ./usr/share/gdb/auto-load/libgobject-2.0.so.0.4200.1-gdb.py \
    ./usr/share/glib-2.0/codegen/__init__.py \
    ./usr/share/glib-2.0/codegen/codegen.py \
    ./usr/share/glib-2.0/codegen/codegen_docbook.py \
    ./usr/share/glib-2.0/codegen/codegen_main.py \
    ./usr/share/glib-2.0/codegen/config.py \
    ./usr/share/glib-2.0/codegen/dbustypes.py \
    ./usr/share/glib-2.0/codegen/parser.py \
    ./usr/share/glib-2.0/codegen/utils.py \
    ./usr/share/glib-2.0/gdb/glib.py \
    ./usr/share/glib-2.0/gdb/gobject.py \
    ./usr/share/glib-2.0/gettext/po/Makefile.in.in \
    ./usr/share/glib-2.0/schemas/gschema.dtd \
    ./usr/share/man/man1/gdbus-codegen.1.gz \
    ./usr/share/man/man1/glib-genmarshal.1.gz \
    ./usr/share/man/man1/glib-gettextize.1.gz \
    ./usr/share/man/man1/glib-mkenums.1.gz \
    ./usr/share/man/man1/gobject-query.1.gz \
    ./usr/share/man/man1/gtester-report.1.gz \
    ./usr/share/man/man1/gtester.1.gz \
    ./usr/share/python/runtime.d/libglib2.0-dev.rtupdate\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
